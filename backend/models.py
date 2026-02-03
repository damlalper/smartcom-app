from pydantic import BaseModel, Field, validator
from typing import List, Optional
from datetime import datetime

class ProductSchema(BaseModel):
    id: str
    title: str
    price: float = Field(gt=0, description="Price must be greater than 0")
    category: str
    
    @validator('category')
    def validate_category(cls, v):
        allowed = ['Electronics', 'Wearables', 'Computers', 'Fashion']
        if v not in allowed:
            raise ValueError(f"Category must be one of {allowed}")
        return v

class UserActivity(BaseModel):
    user_id: str
    action: str
    timestamp: datetime = Field(default_factory=datetime.now)
    details: Optional[str] = None

class RiskAnalysisRequest(BaseModel):
    # Simulating Energy sector context
    region: str
    consumption_kwh: float
    grid_stability_index: float
