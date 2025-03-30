# section 5 - Natural Language Processor (NLP)
## Services
 - Key Phrase Extraction
 - Entity Recognition
 - Sentiment Analysis
 - Translation
 - Speech Recognition
 - Speech Synthesis


## Azure AI Language Service
 - Named Entity Recognition
 - Language Detection
 - Sentiment Analysis
 - Key phrase extraction
 - Custom question answering

 Marketplace / Language service / Create

### Key phrase extraction

[azure language cognitive](https://language.cognitive.azure.com/)

Extract Information / Extract key phrases.

Original sentence: _"This hotel is a great place. The staff were friendly and helpful. The view of the sea was amazing."_

<img src="images\s5\text-extraction.png" alt="Text extraction" width="75%">

#### Postman
Headers:

1. Ocp-Apim-Subscription-Key
2. Content-Type - application/json

URL (POST): `https://egch-language2.cognitiveservices.azure.com/language/:analyze-text?api-version=2022-05-01`

 "kind": `KeyPhraseExtractionResults`


<img src="images\s5\postman-text-extraction.png" alt="postman - Text extraction" width="75%">

### Language Detection
Language Studio / Classify Text / Detect Language

<img src="images\s5\language-detection.png" alt="Language Detection" width="50%">

#### Postman

Same headers, url, body (almos) but this time the Kind is different.

 "kind": `LanguageDetection`

<img src="images/s5/postman-language-detection.png" alt="postman - Language Detection" width="50%">


### Sentiment Analysis
Language Studio / Classify Text / Analyze sentiment and opinions

<img src="images/s5/sentiment-analysis.png" alt="Sentiment Analysis" width="50%">

#### Postman
Same headers, url, body (almost) but this time the Kind is different.

 "kind": `SentimentAnalysis`

<img src="images/s5/postman-sentiment-analysis.png" alt="Postman Sentiment Analysis" width="50%">

### Named Entity Recognition
Language Studio / Extract Information/ Extract named entities

<img src="images/s5/named-entities.png" alt="named entities" width="50%">

#### Postman
Same headers, url, body (almost) but this time the Kind is different.

 "kind": `EntityRecognition`

 [request](json/NamedEntityRecognition_request.json)

 [response](json/NamedEntityRecognition_response.json)
 
<img src="images/s5/postman-named-entities.png" alt="Postman - named entities" width="50%">


## Azure AI Translator
Marketplace / create Translator   
[docs translator](https://learn.microsoft.com/en-us/azure/ai-services/translator/reference/v3-0-reference)


#### Postman

Headers:
1. Ocp-Apim-Subscription-Key
2. Ocp-Apim-Subscription-Region: eastus

URL (POST): `https://api.cognitive.microsofttranslator.com/translate?api-version=3.0&from=en&to=it`

 [request](json/translator_request.json)

 [response](json/translatore_response.json)


## Azure Speech
[What is the Speech service?](https://learn.microsoft.com/en-us/azure/ai-services/speech-service/overview)

Speech scenarios
 - captioning
 - convert speech to text
 - synthesize text to speech
 - translate speech

Marketplace / Speech / Create

Launch `Speech Studio`

<img src="images/s5/speech_studio_captioning.png" alt="speech studio captioning" width="50%">

### Postman
URL (POST):`https://eastus.stt.speech.microsoft.com/speech/recognition/conversation/cognitiveservices/v1?language=en-US&format=detailed`

Headers:
1. Ocp-Apim-Subscription-Key
2. Content-Type - audio/wav






## Azure AI Language
### Search Service
---
[Home](README.md)
