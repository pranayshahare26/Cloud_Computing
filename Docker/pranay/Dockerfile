FROM python:2.7-slim
WORKDIR /home/smokie/Docker/pranay
ADD . /home/smokie/Docker/pranay
RUN pip install --trusted-host pypi.python.org Flask
ENV NAME World
CMD ["python", "app.py"]
