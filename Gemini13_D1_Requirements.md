Requirements (functional and non-functional) of the Gemini project


creat by Zishu Wang I choose Create a Science Plan and Collect Astronomical Data in the Gemini Telescope Control System (GTCS)



Functional Requirements：
Create a Science Plan
 
 users must be able to access the 'Create Science Plan' page.
 Users must be able to input basic information about scientific plans, including:

plan name

Observation target

Observation time window
 
users must be able to select appropriate observation modes and telescope configurations.

system must verify the integrity and correctness of input data before submitting the plan.

If the data is incomplete or incorrect , the system must provide error information to the user and allow them to re edit the plan.

After submitting the scientific plan in , the system must store the plan in the database and generate a unique plan ID.

The  system must display confirmation information to the user that a scientific plan has been successfully created.
Collect Astronomical Data

users must be able to access the 'Collect Astronomical Data' function.

The system must be able to establish a connection with the telescope data acquisition module and retrieve the latest observation data.

The  system must be able to display data summary information, including:


Observed Time

DATA FILE NAME

Data status

users must be able to choose between storing or downloading data.

The  system must ensure that data is stored in the database and provide confirmation of successful storage.

If data storage fails in , the system must provide an option for re storage and display an error message to the user.

If  cannot connect to the telescope data module, the system must notify the user and allow them to retry later.



Non-Functional Requirements：

System Performance

The  system must load the "Create Science Plan" page and the "Collect Astronomical Data" page within 3 seconds.

After submitting the  scientific plan, the system must complete data storage and return the plan ID within 5 seconds.

The connection time between the  data collection module and the telescope shall not exceed 10 seconds.


Security

Only astronomers and scientific observers with valid permissions can access relevant functions.

All user interactions and data storage must be transmitted through an encryption protocol .

All scientific plans and observational data must be stored in controlled databases and comply with access control policies.

Usability

UI design must be clear and intuitive, and users should be able to learn how to create scientific plans or collect data within 30 seconds.

Error messages must be easy to understand and provide clear operational guidelines.

When a scientific plan or data storage fails, the system must provide clear recovery options that allow users to try again.

