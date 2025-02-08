# section 4 - Describe features of computer vision workloads on Azure
Azure Computer Vision

## ComputerVision
https://learn.microsoft.com/en-us/azure/ai-services/computer-vision/overview
### Create Computer Vision
<img src="images/create-computer-vision.png" alt="Create Computer Vision" width="50%">    

Go to Vision Studio.

Behind the scenes, Visual Studio calls the Azure AI Vision service



### Extract common tags from images
Image Analysis / Extract common tags from images

<img src="images/extract-common-tags.png" alt="Extract common tags" width="50%">

### Add captions to images
Image Analysis / Add captions to images

<img src="images/add-captions-to-image.png" alt="add captions" width="70%">

### Object Detection
Image Analysis / Detect common objects in images

<img src="images/detect-common-objects-image.png" alt="Detect common objects in images" width="70%">

Note the bounded rectangle on the images.

#### Json
<img src="images/detect-common-objects-image-json.png" alt="Detect common objects in images - Json" width="70%">


### Extract text from images
Optical character recognition / Extract text from images
<img src="images/extract-text-from-image.png" alt="extract text from image" width="70%">

## API Vision Service
[docs](https://learn.microsoft.com/en-us/rest/api/computervision/image-analysis/analyze-image?view=rest-computervision-v4.0-preview%20(2023-04-01)&tabs=HTTP)

### POST
https://egch-vision.cognitiveservices.azure.com/computervision/imageanalysis:analyze?api-version=2023-04-01-preview&features=tags

### Analyze Image
<img src="images/postman-analyze-image.png" alt="postman-analyze-image" width="70%">
<img src="images/postman-analyze-image-headers.png" alt="postman-analyze-image-headers" width="70%">

## Custom Vision
## AI Face service


## Document Intelligence
https://documentintelligence.ai.azure.com/studio/

## Azure AI Foundry
https://learn.microsoft.com/en-us/azure/ai-studio/what-is-ai-studio
## Links
[Azure Portal Vision Cognitive](https://portal.vision.cognitive.azure.com/gallery/featured)