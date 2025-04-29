# QR Code Generator

Project for a **QR Code Generator** using **Java 21**, **Maven**, **Docker**, and **AWS S3** integration for storage.

## 🚀 Technologies Used
- Java 21
- Maven
- Docker
- AWS S3
- [Zxing](https://github.com/zxing/zxing) (for QR Code generation)

## 📦 Features
- Generate QR Codes from URLs or custom texts.
- Automatically upload generated QR Codes to an AWS S3 bucket.
- Return the public URL of the hosted QR Code.

## 🛠️ Requirements
- Java 21 installed
- Maven 3.8+ installed
- Docker installed
- AWS account with access to S3 (Configured bucket)
- AWS environment variables (`AWS_ACCESS_KEY_ID`, `AWS_SECRET_ACCESS_KEY`, `AWS_REGION`, `AWS_S3_BUCKET`)

## ⚙️ Installation and Execution

### Clone the project
```bash
git clone https://github.com/your-username/qr-code-generator.git
cd qr-code-generator
```
### Setting environment variables
```
export AWS_ACCESS_KEY_ID=your_access_key
export AWS_SECRET_ACCESS_KEY=your_secret_key
export AWS_REGION=your_region
export AWS_S3_BUCKET=your_bucket_name
```
### Build the project
```
mvn clean install
```
### Run locally
```
mvn spring-boot:run

```
### Build Docker image
```
docker build -t gerador-qrcode .

```
### Run with Docker
```
docker run -p 8080:8080 \
  -e AWS_ACCESS_KEY_ID=your_access_key \
  -e AWS_SECRET_ACCESS_KEY=your_secret_key \
  -e AWS_REGION=your_region \
  -e AWS_S3_BUCKET=your_bucket_name \
  gerador-qrcode
```
### Exemple Payload:
```
{
  "text": "https://seusite.com.br"
}
```
### Exemple Response:
```
{
  "qrcodeUrl": "https://your-bucket.s3.amazonaws.com/qrcodes/abc123.png"
}
```




