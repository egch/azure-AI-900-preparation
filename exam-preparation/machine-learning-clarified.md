#  Describe fundamental principles of machine learning on Azure

## Inference
Q. What is the process called when a machine learning model calculates an output value based on one or more input values?

A. Inference

### ✅ Explanation:

**Inference** is the process where a trained machine learning model is used to **make predictions** or **generate outputs** based on **new input data**.

- **Training**: The model learns patterns from historical data.
- **Inference**: The model applies what it has learned to make predictions on unseen data.

Inference is the process that a trained machine learning model* uses to draw conclusions from brand-new data.

#### 🧠 Think of it like this:
- **Training** = learning  
- **Inference** = using what you learned

---

## Mean Absolute Error (MAE)
Q. What evaluation metric is commonly used for evaluating a regression model?

A. Mean Absolute Error (MAE)

### ✅ Explanation:

**Mean Absolute Error (MAE)** is a commonly used metric to evaluate the performance of **regression models**.

It measures the **average absolute difference** between the predicted values and the actual values.

#### 📌 Formula (in plain text):
MAE = (1/n) * Σ | yᵢ - ŷᵢ |

Where:
- yᵢ = actual value  
- ŷᵢ = predicted value  
- n = total number of predictions

#### 🧠 Key point:
MAE gives you an idea of **how wrong** the predictions are **on average**, in the **same units** as the target variable.

---

##  F1 score
Q. What evaluation metric is commonly used for evaluating a binary classification model?   

A. F1 score

### ✅ Explanation:

The **F1 Score** is a widely used evaluation metric for **binary classification models**, especially when the classes are **imbalanced**.

It is the **harmonic mean** of **precision** and **recall**, giving a balanced measure of both.

#### 📌 Formula (in plain text):
F1 Score = 2 * (Precision * Recall) / (Precision + Recall)

Where:
- **Precision** = True Positives / (True Positives + False Positives)  
- **Recall** = True Positives / (True Positives + False Negatives)

#### 🧠 Key point:
The F1 Score helps you understand the balance between **false positives** and **false negatives**, making it useful when **both precision and recall are important**.

---

## Silhouette 
Q. Which metric can be used to evaluate the quality of clusters?   

A. Silhouette
### ✅ Explanation:

The **Silhouette Score** is a metric used to evaluate the **quality of clusters** in clustering algorithms (like K-Means).

It measures how similar a point is to its **own cluster** (cohesion) compared to **other clusters** (separation).

#### 📌 Score range:
- **+1** → well-clustered (clear separation)  
- **0** → overlapping clusters  
- **-1** → likely in the wrong cluster

#### 🧠 Key point:
A **higher Silhouette Score** indicates that the clusters are **well separated and dense**, making it a good indicator of clustering performance.

---

## What is the purpose of feature scaling in machine learning?
A.  To normalize the range of independent variables so that models train more effectively.



### ✅ Explanation:

**Feature scaling** is the process of transforming input features so that they have a **similar scale or distribution**.

This is important for algorithms that are sensitive to the **magnitude** of input values, such as:
- **K-Nearest Neighbors (KNN)**
- **Support Vector Machines (SVM)**
- **Gradient Descent–based models (e.g., Linear Regression, Neural Networks)**

Common techniques include:
- **Min-Max Scaling** (values between 0 and 1)
- **Standardization** (mean = 0, standard deviation = 1)

#### 🧠 Key point:
Without feature scaling, models may perform poorly or converge slowly because features with larger ranges can **dominate** others.

---
## Choosing a Machine Learning Model: Logistic Regression

**Q. You need to identify numerical values that represent the probability of humans developing diabetes based on age and body fat percentage.  
Which type of machine learning model should you use?**  
**A. Logistic Regression**  
[Source: Microsoft Learn](https://learn.microsoft.com/training/modules/fundamentals-machine-learning/)

**Logistic regression** is a classification algorithm used to predict the probability of a binary outcome (e.g., diabetes: yes or no).  
It models the relationship between input features (like age and body fat percentage) and the likelihood of a specific class using a sigmoid function to produce values between 0 and 1.

---

## What is the purpose of cross-validation in machine learning?

To evaluate a model’s performance more reliably by testing it on multiple subsets of the data.

---

### ✅ Explanation:

**Cross-validation** is a technique used to assess how well a machine learning model **generalizes** to unseen data.

It works by:
1. Splitting the dataset into **multiple folds** (e.g., 5 or 10 parts)
2. Training the model on **some folds** and validating it on the **remaining one**
3. Repeating the process multiple times, each time with a different validation fold
4. Averaging the results for a more **robust estimate** of performance

#### 🧠 Key point:
Cross-validation helps reduce the risk of **overfitting** or **underfitting**, making model evaluation **more accurate and dependable**.

---

## Hyperparameter tuning?
The process of finding the best combination of hyperparameters to optimize model performance**

---

### ✅ Explanation:

**Hyperparameter tuning** in **Azure Machine Learning** is the process of **automatically searching** for the best values of hyperparameters (like learning rate, batch size, number of trees, etc.) that improve a model’s **accuracy or performance**.

Azure ML uses techniques like:
- **Grid Search**
- **Random Search**
- **Bayesian Optimization**

to efficiently explore the parameter space.

#### 🧠 Key point:
Hyperparameters are not learned by the model — they are set **before training**, and tuning them can **significantly improve** results.

--- 

## Real-time inference vs Batch inference.

AKS for RTI, Computer Instance for BI

---

### Explanation

- **Real-time inference (RTI)** → Use **Azure Kubernetes Service (AKS)** for low-latency, scalable predictions.
- **Batch inference (BI)** → Use **Azure Machine Learning Compute Instances/Clusters** to process large datasets periodically.


## Logistic Regression vs Linear Regression

**Q. What is the difference between logistic regression and linear regression?**  
**A. Linear regression is used for predicting continuous values, while logistic regression is used for classification tasks.**

| Feature              | Linear Regression                  | Logistic Regression                          |
|----------------------|-------------------------------------|-----------------------------------------------|
| Purpose              | Predict numeric values              | Predict probability of a class                |
| Output               | Real number                         | Value between 0 and 1 (interpreted as probability) |
| Type of ML task      | Regression                          | Classification                                |


Even though it has "regression" in the name, **logistic regression** is used for **classification tasks**.

- ✅ Predicts probability of class membership
- ✅ Commonly used for binary classification (e.g., spam vs. not spam)
- ✅ Can be extended to multi-class classification (softmax/logistic regression)

### Why the confusion?
- It's called "regression" because it models the **log-odds** (a continuous value) as a **linear function** of the input features — but its **end goal** is classification.


