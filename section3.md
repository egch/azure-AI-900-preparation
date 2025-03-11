# section 3 - Describe fundamental principles of machine learning on Azure
## Use Cases
- Detecting fraudulent transactions;
- Recognizing objects (vision);
- Medicine

## ML Progress
1. Training data to train the model
2. Which algorithm needs to be used
3. Once model has been trained you can test/validate the model with some test data.

### Partitions
- Training data - 70%
- Test Data - 30%
### Data Set
- should be relevant to the problem being solved
- There should be enough data
- The data should be free of errors

Not all the transactions or the columns are needed to train your data model.
- Clean the data
- Filter the data.
#### Example - Prediction price of Houses
<img src="images/s3/house-price-prediction.png" alt="House Price prediction" width="80%">



### Binary Classification

## Algorithms
- Classification Algorithms
- Linear Regression Algorithms
- Regression Algorithms
- Anomaly Detection Algorithms
- Time Series Algorithms
- Clustering Algorithms
## ML Techniques
- Supervised Learning
- Unsupervised Learning
- Reinforcement Learning
## Azure ML
### Lab - Creating a workspace
#### Elements
- storage account - to store the log of your job
- Azure Container Registry - for docker containers
- Azure Application Insights - diagnostic information
- Key Vaults - to store secrets


### Launch Studio
<img src="images/s3/LaunchStudio.png" alt="Launch Studio" width="40%">

### Adult Census income Binary Classification

<img src="images/s3/adult-income-binary-pipeline.png" alt="Adult Income Binary Pipeline" width="90%">


confusion matrix
WIth the 30% of the test data we do not use use income column 

<img src="images/s3/confusion-matrix.png" alt="Confusion Matrix" width="50%">


(TP + TN) / ALL

![endpoint](images/s3/endpoint.png)

## Summary
- Regression
- Binary Classification
- Clustering
- Features (training data)
- Accuracy
- Precision
- Recall
- F1Score
- AUC
- Mean absolute error
- Root mean squared error
- relative absolute error
- relative square error
- coefficient of determination
- pipeline
- Inference or batch pipeline
- Automated ML
## References
[How To Use ML To Solve House Price Prediction Problem](https://medium.com/@vivekpadia70/understanding-how-airbnb-uses-machine-learning-to-solve-house-price-prediction-problem-afd5c6c9ec32)


---
[Home](README.md)