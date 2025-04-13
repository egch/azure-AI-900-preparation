# Q&A Clarified
## NaN
Q. When might you see NaN returned for a score in language detection?

A. When the language is ambiguous.

In language detection, a **confidence score** (e.g., `0.98`) shows how sure the system is about the detected language.

However, if the input is:
- **Too short**
- **Ambiguous**
- **Mixed-language**

…the model might **not be able to compute a valid score**. In that case, it returns:

**`NaN`** — which stands for **"Not a Number"**, meaning *"I don’t know the answer."*

#### 💡 Example:
```text
Input: "Hi"
Language: Unknown
Score: NaN
```

## Knowledge base 
Q. You want to create a knowledge base for your organization’s bot service. Which Azure AI service is best suited to creating a knowledge base?

A. Question Answering
### ✅ Clarification

Azure's **Question Answering** (formerly part of QnA Maker) is designed to create a **knowledge base** from sources like FAQs, documents, or URLs. It enables bots and apps to answer user questions by retrieving relevant answers from that content.

- It’s part of **Azure Cognitive Services > Language**.
- Ideal for bots that need to respond with information from a predefined set of documents.

#### 💡 Example Use Case:
You upload an internal FAQ PDF and connect it to your chatbot. When someone asks, “What’s the process for expense reimbursement?”, the bot finds and returns the matching answer from your document.


##  Conversational language understanding

Q. You are authoring a conversational language understanding application to support an international clock. You want users to be able to ask for the current time in a specified city, for example "What is the time in London?". What should you do?

A. Define a "city" entity and a "GetTime" intent with utterances that indicate the city entity.


### ✅ Clarification
In **Conversational Language Understanding** (part of Azure Language services), you need to:

- **Create an intent**: `GetTime` — represents the user's goal (e.g., asking for the time).
- **Define an entity**: `city` — used to extract the variable part from the utterance (e.g., "London").

You also need to **train your model** with example utterances like:
- “What time is it in Paris?”
- “Tell me the current time in Tokyo”
- “What's the time now in New York?”

These examples should include the **city** entity labeled in each phrase so the model learns to identify it dynamically.

#### 💡 Why this matters:
This approach allows the app to generalize across many cities and respond based on the extracted entity (city name), rather than hardcoding responses.

## Which data format is accepted by Azure AI Search
Q. Which data format is accepted by Azure AI Search when you're pushing data to the index?

A. JSON

### ✅ Clarification:
When adding or updating documents in an **Azure AI Search** index, the data must be sent in **JSON format**.

This applies when:
- Uploading data via REST API
- Using SDKs (e.g., Python, .NET)
- Indexing custom content from external apps

Each document is represented as a **JSON object**, with key-value pairs matching the fields defined in your index schema.

#### 💡 Example:
```json
{
  "id": "123",
  "title": "Azure Search Basics",
  "content": "Azure Search allows fast text search at scale..."
}