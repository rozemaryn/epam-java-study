package com.kostyanetskaya.epamjavastudy.lesson8.tasks.contact;

public class Contact {
    private String contactName;
    private ContactInfo name;
    private ContactInfo phoneNumber;
    private boolean phoneNumberAdded;
    private Email[] emails = new Email[3];
    private int emailCounter = 0;
    private Social[] socials = new Social[5];
    private int socialCounter = 0;
    private ContactInfo[] contactInfos;
    private int totalCounter = 0;

    public Contact(String contactName) {
        NameContactInfo name = new NameContactInfo();
        this.contactName = contactName;
        this.name = name;

        totalCounter++;
    }

    private class NameContactInfo implements ContactInfo {
        @Override
        public String getTitle() {
            return "Name";
        }

        @Override
        public String getValue() {
            return contactName;
        }
    }

    public static class Email implements ContactInfo {
        public String localPart;
        public String domain;

        public Email() {
        }

        public Email(String localPart, String domain) {
            this.localPart = localPart;
            this.domain = domain;
        }

        @Override
        public String getTitle() {
            return "Email";
        }

        @Override
        public String getValue() {
            return localPart + "@" + domain;
        }
    }

    public static class Social implements ContactInfo {
        private String title;
        private String id;

        public void setId(String id) {
            this.id = id;
        }

        @Override
        public String getTitle() {
            return title;
        }

        @Override
        public String getValue() {
            return id;
        }

        public void setTitle(String title) {
            this.title = title;
        }
    }

    public void rename(String newName) {
        if (newName != null && !newName.isBlank())
            this.contactName = newName;
    }

    public Email addEmail(String localPart, String domain) {
        Email email = new Email(localPart, domain);
        if (emailCounter < 3) {
            emails[emailCounter] = email;

            emailCounter++;
            totalCounter++;
        } else return null;

        return email;
    }


    public Email addEpamEmail(String firstname, String lastname) {
        Email email = new Email() {
            @Override
            public String getTitle() {
                return "Epam Email";
            }

            @Override
            public String getValue() {
                return firstname + "_" + lastname + "@" + "epam.com";
            }
        };

        if (emailCounter < 3) {
            emails[emailCounter] = email;

            emailCounter++;
            totalCounter++;
        } else return null;
        return email;
    }

    public ContactInfo addPhoneNumber(int code, String number) {
        if(phoneNumberAdded) {
            return null;
        }
        ContactInfo phoneNumber = new ContactInfo() {
            @Override
            public String getTitle() {
                return "Tel";
            }

            @Override
            public String getValue() {
                return "+" + code + " " + number;
            }
        };

        this.phoneNumber = phoneNumber;
        totalCounter++;
        phoneNumberAdded = true;

        return phoneNumber;
    }

    public Social addTwitter(String twitterId) {
        Social twitter = new Social();
        twitter.setTitle("Twitter");
        twitter.setId(twitterId);

        if (socialCounter < 5) {
            socials[socialCounter] = twitter;
            socialCounter++;

            totalCounter++;
        } else return null;

        return twitter;
    }

    public Social addInstagram(String instagramId) {
        Social insta = new Social();
        insta.setTitle("Instagram");
        insta.setId(instagramId);
        if (socialCounter < 5) {
            socials[socialCounter] = insta;
            socialCounter++;

            totalCounter++;
        } else return null;
        return insta;
    }

    public Social addSocialMedia(String title, String id) {
        Social social = new Social();
        social.setTitle(title);
        social.setId(id);
        if (socialCounter < 5) {
            socials[socialCounter] = social;
            socialCounter++;

            totalCounter++;
        } else return null;
        return social;
    }

    public ContactInfo[] getInfo() {
        contactInfos = new ContactInfo[totalCounter];

        int bufCounter = 1;

        contactInfos[0] = name;

        if (phoneNumber != null) {
            contactInfos[1] = phoneNumber;
            bufCounter++;
        }
        if (emailCounter != 0) {
            for (int i = 0; i < emailCounter; i++) {
                contactInfos[bufCounter] = emails[i];
                bufCounter++;
            }
        }
        if (socialCounter != 0) {
            for (int i = 0; i < socialCounter; i++) {
                contactInfos[bufCounter] = socials[i];
                bufCounter++;
            }
        }
        return contactInfos;
    }
}