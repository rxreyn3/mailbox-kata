Outside-In TDD with Acceptance Tests
====================================

### Objective

Learn and practice the double loop of TDD
Test application from outside, identifying side effects

### Problem description - Bank kata

Create a simple messaging application with the following features:

     - Send a direct message to a recipient
     - Sent a message to a segment of recipients
     - Recipients should see their direct and segment messages in a normalized 
     format
     - Enable message states: unread, read, deleted

## Acceptance criteria

REST endpoints should display a recipients' inbox as follows:

| SENDER    | SUBJECT                | RECEIVED         | UNREAD  |
| --------- | ---------------------- | ---------------- | :-----: |
| BDV       | Welcome to the mailbox | 10/24/2020 09:35 |    *    |
| Mud Shark | That's HAWT            | 9/30/2020 19:00  |         |
| The Bean  | Dic Pic                | 8/1/2020 12:21   |         |

## Starting point and constraints

- Messages sent to segments cannot be duplicated for each recipient.
- Recipients can belong to one or more segments.
- A single recipient should be able to delete a segment directed message without 
deleting it for other recipients in the same segment

Start with a class the following structure:

    class Mailbox {
        fun sendTo(recipient: Recipient, message: Message): Nothing = TODO()
    
        fun broadcastTo(segments: List<Segment>, message: Message): Nothing = TODO()
    
        fun fetchMailFor(recipient: Recipient): List<Message> = TODO()
    }

You are not allowed to add any other public method to this class.

**NOTE:** In order to keep the exercise simple, use _int_ for money and _String_ for dates.
Also, you can ignore the formatting of the statement (spaces between pipes and words, etc).
