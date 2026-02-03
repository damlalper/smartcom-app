from fastapi import FastAPI, HTTPException
from models import ProductSchema, UserActivity, RiskAnalysisRequest
from etl import ETLProcessor

app = FastAPI(title="SmartCommerce Data Service", version="1.0.0")
etl = ETLProcessor()

@app.get("/")
def read_root():
    return {"message": "SmartCommerce Data & Analytics Service is Running"}

@app.post("/analyze/risk")
def analyze_risk(request: RiskAnalysisRequest):
    """
    Simulates an ETL pipeline for Energy Sector Risk Analysis.
    1. Extract: Receive request data.
    2. Transform: Calculate Risk Score using Pandas.
    3. Load: Save to local JSON storage.
    """
    try:
        # Extract
        raw_data = request.model_dump()
        extract_data = etl.extract(raw_data)
        
        # Transform
        transformed_data = etl.transform(extract_data)
        
        # Load
        final_data = etl.load(transformed_data)
        
        return {
            "status": "success", 
            "result": final_data
        }
    except Exception as e:
        raise HTTPException(status_code=500, detail=str(e))

@app.post("/validate/product")
def validate_product(product: ProductSchema):
    """
    Validates product data using Pydantic.
    """
    return {"status": "valid", "product": product}
