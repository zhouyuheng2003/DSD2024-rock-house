## 🔔 Recent Update:
* Cheers! We have completed this project.
## 📖 About the Project

This project is for DSD, 2024 Spring. We are aiming to design an intelligent **Treasure Exploration System** with users from multiple platforms. More information is coming soon after further discussion.

We are the **Android group**.

There are 6 groups in this project and they are:
|  Group Name   | Work       | Link       |
| -----------   | ---------- |   -------- |
|  Rock House   | Android    |[link](https://github.com/zhouyuheng2003/DSD2024)|
|Better Call Li | Algorithm  |[link](https://github.com/baconjlu/better-call-Li)|
|Brave ones     |Wechat APP  |[link](https://github.com/Divpeter/DSD2024.github.io)|
|Dream, Share, Discover| Web APP |[link](https://github.com/zkc3783/dream-share-discover)|
|Backrooms | Database |[link](https://github.com/Irodixy/Backrooms_dsd2024)|

Ciel is the TA of this course, and he has a lot of experience in arranging projects. ([upload file to him](https://dsm.ciel.pro/sharing/zHhcgChco))

## 🧥 Team Member

-  [Ziyu Sun](Zysun2002@github.com "Zysun's github"): A junior student from the Computer Science Department of JLU with average programming skills but good communication ability. He will try his best to be a responsible and nice team leader. (He is easy-going and passionate about working with you guys!)
-  [Yuheng Zhou](https://github.com/zhouyuheng2003): Also called Henry, a junior student from the Computer Science Department of JLU. He has good programming skills and has won the gold medal in the ICPC regional competition. Though his current oral English level is moderate, he has a passion for exchanging ideas.
-  [Haoyang Su](https://github.com/JluShy): He is a junior student at Jilin University, and his English name is Steve. While his English proficiency is moderate, he is passionate about engaging in communication and collaboration with others. He has previously served as the primary contributor in artificial intelligence-related projects.
-  [Yuhai Li](https://github.com/yigeqianshuixiaobai): Also called Nick. He is a junior student from the Computer Science Department of JLU. He has moderate programming skills and has won the bronze medal in the ICPC regional competition. His English proficiency is average, but he will do his best to complete the tasks assigned to him.
-  [António Vieira](https://github.com/ToGregas): He is a  1st year electrical and computing engineering in UTAD. He is an easy to relate guy and one of his best skills is communicating with others. His English is good to the point he feels comfortable writing papers in English and will try his best to do any task he is given.
-  [Hugo Andrade](https://github.com/ManWorf): He is a student in Informatic Engineering from UTAD with decent programming skills, good English proficiency, a desire to learn more, and a good challenge. He will do his best to do a good job.

|                | PM       | RA     | SA     | Developer | Tester | Liason |
| -----------    | -------- |  ----  | ----   | --------- | ------ | ------ |
| Ziyu Sun       | &#10004; |        |&#10004;|           |        |&#10004;|
| Yuheng Zhou    |          |&#10004;|        |&#10004;   |        |        |
| Yuhai Li       |          |        |        |&#10004;   |&#10004;|        |
| Haoyang Su     |          |        |&#10004;|           |&#10004;|        |
| António Vieira |          |&#10004;|        |           |        |&#10004;|
| Hugo Andrade   |          |        |&#10004;|&#10004;   |        |        |

Our team consists of four students from JLU and two students from UTAD. Member duties will be determined through discussion.

## 📻 News
2024.5.22： Our coder Henry had a meeting with Database group and brought contributive ideas to the interface spacification documents. Together with some changes from Web group, we update the [Interface Specification v.7.1](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/interface%20specification%20v.7.1.md)

2024.5.20： We have made a visualization of the Recommendation and Feedback process with a [data flow graph](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/Data%20Flow%20Graph.png).

2024.5.15： Now we are entering the second iteration for SA. We update the [Interface Specification v.7.0](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/interface%20specification%20v.7.0.md) with WIFI function.

2024.4.26: It's a pitty that we are still updating the  [Interface Specification v.6.4](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/interface%20specification%20v.6.4.md). We are trying to make the minimum change and notify the relevant groups with each updates.
1. In Feedback2Item and Feeback2Store, the "Item" and "Store" have been changed to "ItemId" and "StoreId".
2. The interface 5 and interface 11 will be first called by front end and then be responded by the database.
3. All the InterfaceId and CurrentUser from Web part have been removed.

2024.4.24：We update the [Interface Specification v.6.3](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/interface%20specification%20v.6.3.md). Hopefully this could be the final one(for the first iteration):
1. Unpacking the encapsulated data interfaces of Web.
2. Update the "Interests" items.


2024.4.24：[Our Gantt Diagram](//github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Group%20Document/gantt.png) is ready. Later than expected by quite a bit though.

2024.4.24：Latest update of Interface Specification from v.5 to v.6.2:
  1. Add the 'VisitTime' to HuntedList.
  2. Add Algorithm interfaces to deal with feedback.
  3. Specify the two kind of feedback:

    (1) Feedback2Store is used to give feedback to the recommendation results (a store) and helps optimize recommendation algorithm.
    (2) Feedback2Item is used to give feedback to the purchased item and helps stores to offer better service.
  4. Update the description of the algorithm group.
  5. The web group modified some interfaces and added description.
  6. The interests have been changed from integer array to string.
  7. The interface one return an additional "interests". 
  8. Add "Interests" and "HuntedStoreList" to object::User.

2024.4.22：We updated the [Interface Specification v.6](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/interface%20specification%20v.6.0.md) with the changes located in the end of the document.

2024.4.17：We updated the [Interface Specification v.5](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/interface%20specification%20v.5.2.pdf) with the changes located in the end of the document. We are asking other teams to add more interface descriptions to help coding.

2024.4.13: We divided the development work into three parts: profile, explore, and display. Three coders start their work.

2024.4.12: We updated the [Interface Specification v.4](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Group%20Document/Interface%20Specification%20from%20Android%20Group%20v4.pdf).

2024.4.10: We updated the [Interface Specification v.3](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Group%20Document/Interface%20Specification%20from%20Android%20Group%20v3.pdf).

2024.4.8: We are collecting documents from other groups. The project documentation is expected to be written after the collection is done.

2024.4.8: We have finished the [Interface Specification from Android Group](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Group%20Document/Interface%20Specification%20from%20Android%20Group%20v1.pdf).

2024.4.7: All the SA Diagram have been sent to us and we have completed the [SA Diagram](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/Software%20Architecture%20Component%20Diagram%20v2.png) for the whole project. 

2024.4.1: We have received the SA Diagram from DSD and Better Call Li. Really good job.

2024.3.28: We have finished the second version of the [Diagram of the Android Part](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Group%20Document/component%20diagram%20and%20class%20diagram.v2.pdf).

2024.3.27: RAs provide some advice to improve the specification and the diagram, the modification work is in progress.

2024.3.26: We have finished the first version of the [Diagram of the Android Part](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Group%20Document/Software%20Architecture%20Diagram%20from%20Android%20Group.png). Our team leader has a meeting with other PMs.

2024.3.23: We have finished the first version of the [Software Architecture Specification from Android Group](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Group%20Document/Software%20Architecture%20Specification%20from%20Android%20Group%20v1.pdf).

2024.3.21: We have a group meeting tonight. We are responsible for the System Architecture of the whole project, so we have discussed the 3 time periods of this work. Firstly, our group will finish a template before March 25th. Secondly, the template will be published and every group should refer to this template and finish their analysis work before April 1st. Thirdly our group will gather all the documents and merge them into one final version before April 5th. Besides, we discussed the format and tools. Finally, we can begin our task. 

2024.3.18: We get the final vision of the '[Use Case Diagram](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/Use%20Case%20Diagram.pdf)' and '[Software Requirements Specification](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Project%20Document/Software%20Requirements%20Specification%20v1.3.md)'. Today is the end of the Requirement Analysis Stage and the beginning of the System Architecture Stage.

2024.3.15: We have received the draft of the ‘Use Case Diagram’ and 'Software Requirements Specification'. After confirming the content, we provided some suggestions.

2024.3.14: After two days of multiple version iterations, the final version of the file [Requirement Analysis from Android Group](https://github.com/zhouyuheng2003/DSD2024-rock-house/blob/main/Group%20Document/Requirement%20Analysis%20from%20Android%20Group.pdf) has been completed. In the whole process, PM provided the template, and two analyzing documents were provided by two RAs of our group. During the meeting, we discussed what other content we could add. After that, two RAs worked together to merge all the ideas into this final version.

2024.3.12: We have a group meeting tonight. We have discussed the team roles and requirement analysis. We have updated the team role table. We can move on further. 

2024.3.6: Cheers! We have six members in place. We get our team name "Rock House" which is the home of Patrick Star in the cartoon "SpongeBob".

2024.3.5: We are hiring self-motivated partners from UTAD!

2024.3.4: Brief introduction of 4 team members from JLU ready.

## ✒️ How to contribute to the webpage

If you want to update the GitHub webpage, please follow the instructions:

1. Fork this repository
2. Clone your fork: `git clone https://github.com/your-username/project.git`
3. Create a new branch: `git checkout -b new-branch-name`
4. Make changes to the new branch
5. Commit your changes: `git commit -m "Describe your changes"`
6. Push your branch to GitHub: `git push origin new-branch-name`
7. Submit a Pull Request

