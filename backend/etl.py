import pandas as pd
import json
from datetime import datetime
import os

DATA_FILE = "data_store.json"

class ETLProcessor:
    def __init__(self):
        # Ensure data file exists
        if not os.path.exists(DATA_FILE):
             with open(DATA_FILE, 'w') as f:
                 json.dump([], f)

    def extract(self, data: dict):
        """Simulate extracting data from raw input"""
        print(f"[{datetime.now()}] Extracting data: {data}")
        return data

    def transform(self, raw_data: dict) -> dict:
        """
        Transform data: 
        - Calculate 'Risk Score' based on simulation logic.
        - Normalize strings.
        """
        print(f"[{datetime.now()}] Transforming data...")
        df = pd.DataFrame([raw_data])
        
        # Example Transformation Logic
        if 'consumption_kwh' in df.columns:
            # Complex logic simulation: High consumption + Low Stability = High Risk
            df['risk_score'] = (df['consumption_kwh'] * 0.5) / (df['grid_stability_index'] + 0.1)
            df['risk_level'] = df['risk_score'].apply(
                lambda x: 'CRITICAL' if x > 100 else ('WARNING' if x > 50 else 'NORMAL')
            )
        
        transformed = df.to_dict(orient='records')[0]
        transformed['processed_at'] = datetime.now().isoformat()
        return transformed

    def load(self, transformed_data: dict):
        """Load processed data into storage (JSON file simulation)"""
        print(f"[{datetime.now()}] Loading data to storage...")
        
        with open(DATA_FILE, 'r+') as f:
            file_data = json.load(f)
            file_data.append(transformed_data)
            f.seek(0)
            json.dump(file_data, f, indent=4)
            
        print("Data loaded successfully.")
        return transformed_data
