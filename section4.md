# section 4 - Describe features of computer vision workloads on Azure
Azure Computer Vision

## ComputerVision
From Marketplace create Computer Vision resource.

https://learn.microsoft.com/en-us/azure/ai-services/computer-vision/overview
### Create Computer Vision
<img src="images/s4/create-computer-vision.png" alt="Create Computer Vision" width="50%">    

The click on **Go to Vision Studio**.   
Alternative we can use _Azure AI Foundry_.

Behind the scenes, Visual Studio calls the Azure AI Vision service.



### Extract common tags from images
Image Analysis / Extract common tags from images

<img src="images/s4/extract-common-tags.png" alt="Extract common tags" width="50%">

For each tag it provides a confidence code (0-100%).

We can also see the json contents.

### Add captions to images
Image Analysis / Add captions to images

<img src="images/s4/add-captions-to-image.png" alt="add captions" width="70%">

### Object Detection
Image Analysis / Detect common objects in images

<img src="images/s4/detect-common-objects-image.png" alt="Detect common objects in images" width="70%">

Note the bounded rectangle on the images.

#### Json
<img src="images/s4/detect-common-objects-image-json.png" alt="Detect common objects in images - Json" width="70%">


### Extract text from images
Optical character recognition / Extract text from images.

<img src="images/s4/extract-text-from-image.png" alt="extract text from image" width="70%">

## API Vision Service


[docs](https://learn.microsoft.com/en-us/rest/api/computervision/image-analysis/analyze-image?view=rest-computervision-v4.0-preview%20(2023-04-01)&tabs=HTTP)

### Analyze Image

<img src="images/s4/computer-vision-endpoint.png" alt="computer vision endpoint" width="70%">

### POST
URL: https://egch-vision.cognitiveservices.azure.com/computervision/imageanalysis:analyze?api-version=2023-04-01-preview&features=tags

In the Body, change the type to binary, then upload a file.


#### Headers
- **Ocp-Apim-Subscription-Key**: corresponding to the key of `computervision` in Azure
- **Content-Type**: application/octet-stream

<img src="images/s4/postman-analyze-image-headers.png" alt="postman-analyze-image-headers" width="70%">



### Response
<img src="images/s4/postman-analyze-image.png" alt="postman-analyze-image" width="70%">


## Custom Vision
Create from Azure Marketplace.
https://www.customvision.ai/
### Project Cats recognition
<img src="images/s4/cats.png" alt="cats" width="70%">

- add
- train
- quick train

<img src="images/s4/cats-train.png" alt="cats-train" width="70%">

Quick test (tiger)

<img src="images/s4/cats-tiger.png" alt="cats-train" width="70%">

## Azure AI Face service
https://learn.microsoft.com/en-us/azure/ai-services/computer-vision/overview-identity

Create Face from the marketplace.
## AI Face service
- Marketplace create Face
- Vision Studio / Face / Detect faces in an image

<img src="images/s4/detect-face.png" alt="detect face" width="70%">

### Face detection via postman
https://learn.microsoft.com/en-us/rest/api/face/face-detection-operations/detect?view=rest-face-v1.2-preview.1&tabs=HTTP

<img src="images/s4/face-postman.png" alt="postman face" width="70%">


## Document Intelligence
[Document Intelligence Studio](https://documentintelligence.ai.azure.com/studio/)
### Invoices
Studio / Invoices

<img src="images/s4/invoices.png" alt="invoices" width="70%">

## Azure AI Foundry
[Azure AI Foundry docs](https://learn.microsoft.com/en-us/azure/ai-studio/what-is-ai-studio)

- MarketPlace / Azure AI Foundry

- Launch Azure AI Foundry

- Create Project

### Project - Common image detection
AI Services / Vision + Document / Image / Common image detection

From here we have the same interfaces seen with Visual Studio.

<img src="images/s4/foundry-detect-image.png" alt="detect image" width="70%">
  
### Project - Invoices
AI Services / Vision + Document / Document / Invoices
## Links
[Azure Portal Vision Cognitive](https://portal.vision.cognitive.azure.com/gallery/featured)

---
[Home](README.md)