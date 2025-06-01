# Describe AI workloads and considerations 
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
```


## Deep Learning
Q.  What is deep learning?   

A. An advanced form of machine learning inspired by the human brain.

### ✅ Explanation:

**Deep learning** is a **subset of machine learning** that uses **artificial neural networks** with many layers (hence "deep") to model and learn complex patterns in data.

It is inspired by the structure and function of the **human brain**, particularly how neurons process and transmit information.

#### 🧠 Key point:
Deep learning is especially powerful for tasks like **image recognition**, **natural language processing**, and **speech recognition**, where large amounts of data and complex patterns are involved.

---

## Neural Network
Q. What is a neural network?   

A. A function that maps inputs to outputs based on learned weights.

### ✅ Explanation:

A **neural network** is a set of **interconnected nodes (neurons)** organized in layers that can learn to map **inputs to outputs** by adjusting **weights** during training.

It mimics how neurons in the human brain work, where each connection (weight) influences the final result.

#### 🧠 Key point:
Neural networks **learn patterns** in data by updating weights through a process called **backpropagation**, allowing them to perform tasks like classification, regression, or pattern recognition.

---

## Azure Multi-service and Single-service
Q. What are the two types of Azure AI service resources?  

A. Multi-service and single-service

### ✅ Explanation:

Azure AI offers two types of service resources for managing and accessing its capabilities:

- **Multi-service**: A single resource that provides access to **multiple Azure AI services** (e.g., Vision, Language, Speech) under one key and endpoint.
- **Single-service**: A resource dedicated to **one specific Azure AI service**, giving more focused control and possibly optimized billing.

#### 🧠 Key point:
Use **multi-service** for flexibility across services, and **single-service** for more control or when you only need one capability.

---

## Skillset in Azure AI Search
Q. What is the purpose of a skillset in Azure AI Search?

A. To apply a sequence of AI skills to enrich data
### ✅ Explanation:

In **Azure AI Search**, a **skillset** is a collection of **cognitive skills** that are applied to **extract and enrich information** from raw content (like documents, images, etc.).

These skills can include:
- OCR (optical character recognition)
- Language detection
- Entity recognition
- Key phrase extraction

#### 🧠 Key point:
A skillset enables **AI enrichment**, allowing you to **transform unstructured data into searchable content**.

---

## Queries in Azure AI Search
Q.  What is the default search syntax for queries in Azure AI Search?

A. Simple query syntax

### ✅ Explanation:

In **Azure AI Search**, the **default query syntax** is called **Simple query syntax**.

It is designed to be:
- **User-friendly**
- Similar to how people search in web browsers
- Supporting basic operations like `AND`, `OR`, `NOT`, and `*` (wildcard)

#### 🧠 Key point:
Simple query syntax is ideal for **end-user search boxes**, while **full Lucene syntax** can be used for more **advanced scenarios**.

---

## Attention layers in transformer models
Q. What is the role of attention layers in transformer models? 

A. To evaluate the semantic relationships between tokens.
### ✅ Explanation:

In **transformer models**, **attention layers** allow the model to **focus on different parts of the input sequence** when processing each token.

They help the model understand:
- **Which words are important** in context
- **How words relate** to each other, regardless of their position in the sequence

#### 🧠 Key point:
Attention layers enable transformers to capture **semantic meaning** and **contextual relationships**, making them highly effective in **natural language processing (NLP)** tasks.

---

## The metaprompt and grounding layer
Q. Which layer of a generative AI solution focuses on the construction of prompts submitted to the model?

A. The metaprompt and grounding layer.

### ✅ Explanation:

The **metaprompt and grounding layer** in a **generative AI solution** is responsible for crafting and structuring the **prompts** that are sent to the model.

This layer ensures that:
- The prompts are **clear, specific, and aligned** with the task
- Context and constraints (grounding) are included to guide the model's output

#### 🧠 Key point:
Effective prompt construction is essential for getting **reliable and relevant results** from a generative AI model.

---
## What is the **None** intent used for in conversational language understanding?

To handle utterances that do not match any other intent** ✅

---

### Explanation

The **"None" intent** (also known as the **Fallback** or **Default** intent) is used to catch user input that doesn't clearly match any of the predefined intents in a conversational application.

#### Example
If your chatbot has intents like:
- `OrderPizza`
- `CheckOrderStatus`

And the user says:
> *"Tell me a joke"*

This utterance doesn't match any known intent, so it is classified under the **"None"** intent.

#### Purpose
- Prevents the bot from giving irrelevant or incorrect responses.
- Allows the bot to handle unexpected input gracefully (e.g., "Sorry, I didn’t understand that. Can you rephrase?").

## Responsible AI: Accountability

**Q. Which principle of responsible artificial intelligence (AI) defines the framework of governance and organization principles that meet ethical and legal standards of AI solutions?**  
**A. Accountability**  
[Source: Microsoft Learn](https://learn.microsoft.com/training/modules/get-started-ai-fundamentals/8-understand-responsible-ai)

**Accountability** in responsible AI refers to ensuring that AI systems:

- Comply with **ethical and legal standards**
- Have clear **governance structures**
- Include human oversight and traceability

This principle ensures that organizations and individuals take **ownership and responsibility** for the behavior and outcomes of AI systems.


## 🧠 Generative AI: System Messages

### What is a System Message?

A **system message** is a special instruction sent to a generative AI model **before any user input**.  
It helps define the model’s **behavior, tone, and boundaries** during a conversation.

---

### ✅ Purpose of System Messages

- Set the **role or persona** (e.g., helpful assistant, travel guide)
- Establish **rules and constraints** (e.g., avoid legal advice)
- Control **tone and response style** (e.g., formal, concise, friendly)
- Maintain **conversation context** across turns

---

### 📦 Example Format

```json
[
  {"role": "system", "content": "You are a friendly and concise travel assistant."},
  {"role": "user", "content": "Where should I go for a beach vacation in October?"}
]
```

## Responsible AI: Transparency

**Q. Which principle of responsible artificial intelligence (AI) raises awareness about the limitations of AI-based solutions?**  
**A. Transparency**  
[Source: Microsoft Learn](https://learn.microsoft.com/training/modules/get-started-ai-fundamentals/8-understand-responsible-ai)

**Transparency** involves making AI systems understandable to users and stakeholders.  
It raises awareness of:

- How decisions are made
- What data is used
- The **limitations** and boundaries of AI models

This principle promotes **trust** and informed use of AI.


## Responsible Generative AI: Safety System Layer

**Q. At which layer can you apply content filters to suppress prompts and responses for a responsible generative AI solution?**  
**A. Safety system**  
[Source: Microsoft Learn](https://learn.microsoft.com/training/modules/get-started-ai-fundamentals/)

The **safety system** layer applies **content filtering**, moderation, and risk mitigation techniques to:

- Block harmful prompts or responses
- Detect inappropriate or biased language
- Enforce compliance and ethical standards

This is a critical part of **building responsible AI solutions**, especially in public-facing applications.
