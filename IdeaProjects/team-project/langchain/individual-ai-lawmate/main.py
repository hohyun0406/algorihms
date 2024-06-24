from fastapi import FastAPI
import uvicorn
from datetime import datetime
import pytz

app = FastAPI()

@app.get("/")
def root():
    korea_tz = pytz.timezone('Asia/Seoul')
    current_time = datetime.now(korea_tz).strftime("%Y-%m-%d %H:%M:%S")
    return {"message": f"Hello! 현재 시각: {current_time}"}

if __name__ == "__main__":
    uvicorn.run(app, host="localhost", port=8000)