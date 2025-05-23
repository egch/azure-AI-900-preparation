# Describe features of conversational AI workloads on Azure
## Knowledge base 
Q. You want to create a knowledge base for your organization’s bot service. Which Azure AI service is best suited to creating a knowledge base?

A. Question Answering
### ✅ Clarification

Azure's **Question Answering** (formerly part of QnA Maker) is designed to create a **knowledge base** from sources like FAQs, documents, or URLs. It enables bots and apps to answer user questions by retrieving relevant answers from that content.

- It’s part of **Azure Cognitive Services > Language**.
- Ideal for bots that need to respond with information from a predefined set of documents.

#### 💡 Example Use Case:
You upload an internal FAQ PDF and connect it to your chatbot. When someone asks, “What’s the process for expense reimbursement?”, the bot finds and returns the matching answer from your document.

---

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

---

## Utterance in conversational language understanding
Q. What is an utterance in conversational language understanding?

A. An example of something a user might say that the application must interpret.

## ✅ Explanation:

In **conversational language understanding** (like with chatbots or virtual assistants), an **utterance** is a **sentence or phrase** that a user speaks or types.

It's an example of how a user might express an **intent**, which the application needs to **understand and process** correctly.

#### 🧠 Key point:
Utterances help train the model to recognize **varied ways** users might phrase the same **intent** (e.g., "What's the weather like?" vs "Is it going to rain today?").

---

## What is an entity in conversational language understanding?
An item to which an utterance refers.

---

### Explanation

In conversational language understanding, an **entity** is a specific piece of information referenced in a user's utterance. Entities help extract **key details** that provide context and meaning to the intent.

#### Example
User says:
> *"Book a table for two at 7 PM."*

Possible entities:
- `"two"` → **number of people**
- `"7 PM"` → **time**

#### Purpose
- Enables the system to capture and process relevant data from user input.
- Works alongside intents to fulfill user requests accurately.
