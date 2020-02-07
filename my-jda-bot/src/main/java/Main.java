import net.dv8tion.jda.api.AccountType;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import javax.security.auth.login.LoginException;

public class Main extends ListenerAdapter {
    public static void main(String[] arg) throws LoginException {
        JDABuilder builder = new JDABuilder(AccountType.BOT);
        String token = "NjczMDI2MDczNTY2MzgwMDMy.XjUICQ.ic5Hvflx2NCs6dA_oP9o5lbfzGw";
        builder.setToken(token);
        builder.addEventListeners(new Main());
        builder.build();
    }

    @Override
    public void onMessageReceived(MessageReceivedEvent event){
        System.out.println(
                event.getAuthor().getName() + " sent " +
                event.getMessage().getContentDisplay()
        );
        if(event.getAuthor().isBot()) {
            return;
        }

        if(event.getMessage().getContentRaw().equals("!help")){
            event.getChannel().sendMessage("!simp !jacuzziless !man dies !MORGZ MUM DIES AGAIN !mirror force !supercat !kanye !elmo !snakeskip !shrek !realdice !yuumi !scrat !MORGZ MUM !donger !answer !graves !yasuo !adc !Who's Joe? !How are you feeling today? !dice !yin !cat !food !ever !ping !plate !pickle !furry").queue();
        }

        /* -------------
            Simple Text
           ------------- */

        if(event.getMessage().getContentRaw().equals("!ping")){
            event.getChannel().sendMessage("Pong!").queue();
        }
        if(event.getMessage().getContentRaw().equals("!plate")){
            event.getChannel().sendMessage("AHAHAHAHAH").queue();
        }
        if(event.getMessage().getContentRaw().equals("!pickle")){
            event.getChannel().sendMessage("More like frickle").queue();
        }
        if(event.getMessage().getContentRaw().equals("!furry")){
            event.getChannel().sendMessage("no u").queue();
        }
        if(event.getMessage().getContentRaw().equals("!ever")){
            event.getChannel().sendMessage("quest").queue();
        }
        if(event.getMessage().getContentRaw().equals("!food")){
            event.getChannel().sendMessage("Uber Eats").queue();
        }
        if(event.getMessage().getContentRaw().equals("!cat")){
            event.getChannel().sendMessage("Meow\n").queue();
        }
        if(event.getMessage().getContentRaw().equals("!supercat")){
            event.getChannel().sendMessage("Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow Meow ").queue();
        }
        if(event.getMessage().getContentRaw().equals("!yin")){
            event.getChannel().sendMessage("yang").queue();
        }
        if(event.getMessage().getContentRaw().equals("!dice")){
            event.getChannel().sendMessage("1").queue();
        }
        if(event.getMessage().getContentRaw().equals("!How are you feeling today?")){
            event.getChannel().sendMessage("fat").queue();
        }
        if(event.getMessage().getContentRaw().equals("!Who's Joe?")){
            event.getChannel().sendMessage("Joe Mama!").queue();
        }
        if(event.getMessage().getContentRaw().equals("!adc")){
            event.getChannel().sendMessage("Garen main btw").queue();
        }
        if(event.getMessage().getContentRaw().equals("!simp")){
            event.getChannel().sendMessage("https://twitter.com/nopeifyaltalt/status/1225200645818458112?s=20").queue();
        }
        if(event.getMessage().getContentRaw().equals("!jacuzziless")){
            event.getChannel().sendMessage("https://twitter.com/erectums/status/1224432579681472513?s=20").queue();
        }
        if(event.getMessage().getContentRaw().equals("!graves")){
            event.getChannel().sendMessage("You will never have a grave, Graves... see, it's 'cause your name, it's... your name is like a grave, it's - I - never mind.").queue();
        }
        if(event.getMessage().getContentRaw().equals("!answer")){
            event.getChannel().sendMessage("The answer is C, 418").queue();
        }
        if(event.getMessage().getContentRaw().equals("!donger")){
            event.getChannel().sendMessage("Back, you dirty ape, back!").queue();
        }
        if(event.getMessage().getContentRaw().equals("!MORGZ MUM")){
            event.getChannel().sendMessage("morgz mum dies").queue();
        }
        if(event.getMessage().getContentRaw().equals("!man dies")){
            event.getChannel().sendMessage("https://twitter.com/timthetatman/status/1225284576123215874?s=20").queue();
        }
        if(event.getMessage().getContentRaw().equals("!MORGZ MUM DIES AGAIN")){
            event.getChannel().sendMessage("https://www.youtube.com/watch?v=8ie4kFeM9WA").queue();
        }
        if(event.getMessage().getContentRaw().equals("!scrat")){
            event.getChannel().sendMessage("pack").queue();
        }
        if(event.getMessage().getContentRaw().equals("!snakeskip")){
            event.getChannel().sendMessage("hold w").queue();
        }
        if(event.getMessage().getContentRaw().equals("!shrek")){
            event.getChannel().sendMessage("I'm not the sharpest tool in the shed.").queue();
        }
        if(event.getMessage().getContentRaw().equals("!mirror force")){
            event.getChannel().sendMessage("https://www.amazon.com/Yu-Gi-Oh-Mirror-SDDL-EN035-Structure-Dragunity/dp/B004T3J9MY").queue();
        }
        if(event.getMessage().getContentRaw().equals("!elmo")){
            event.getChannel().sendMessage("https://tenor.com/view/elmo-jump-gif-4462652").queue();
        }
        if(event.getMessage().getContentRaw().equals("!realdice")){
            int Random = ((int)(Math.random()*20))+1;
            switch (Random) {
                case 1:
                    event.getChannel().sendMessage("1").queue();
                    break;
                case 2:
                    event.getChannel().sendMessage("2").queue();
                    break;
                case 3:
                    event.getChannel().sendMessage("3").queue();
                    break;
                case 4:
                    event.getChannel().sendMessage("4").queue();
                    break;
                case 5:
                    event.getChannel().sendMessage("5").queue();
                    break;
                case 6:
                    event.getChannel().sendMessage("6").queue();
                    break;
                case 7:
                    event.getChannel().sendMessage("7").queue();
                    break;
                case 8:
                    event.getChannel().sendMessage("8").queue();
                    break;
                case 9:
                    event.getChannel().sendMessage("9").queue();
                    break;
                case 10:
                    event.getChannel().sendMessage("10").queue();
                    break;
                case 11:
                    event.getChannel().sendMessage("11").queue();
                    break;
                case 12:
                    event.getChannel().sendMessage("12").queue();
                    break;
                case 13:
                    event.getChannel().sendMessage("13").queue();
                    break;
                case 14:
                    event.getChannel().sendMessage("14").queue();
                    break;
                case 15:
                    event.getChannel().sendMessage("15").queue();
                    break;
                case 16:
                    event.getChannel().sendMessage("16").queue();
                    break;
                case 17:
                    event.getChannel().sendMessage("17").queue();
                    break;
                case 18:
                    event.getChannel().sendMessage("18").queue();
                    break;
                case 19:
                    event.getChannel().sendMessage("19").queue();
                    break;
                case 20:
                    event.getChannel().sendMessage("20").queue();
                    break;
                default:
            }
        }
        if(event.getMessage().getContentRaw().equals("!kanye")){
            int Random = ((int)(Math.random()*9));
            switch (Random) {
                case 0:
                    event.getChannel().sendMessage("She find pictures in my email").queue();
                    break;
                case 1:
                    event.getChannel().sendMessage("I sent this bitch a picture of my dick").queue();
                    break;
                case 2:
                    event.getChannel().sendMessage("I don't know what it is with females").queue();
                    break;
                case 3:
                    event.getChannel().sendMessage("But I'm not too good at that shit").queue();
                    break;
                case 4:
                    event.getChannel().sendMessage("Put my fist in her like a civil rights sign").queue();
                    break;
                case 5:
                    event.getChannel().sendMessage("She got a light-skinned friend, look like Michael Jackson. Got a dark-skinned friend, look like Michael Jackson.").queue();
                    break;
                case 6:
                    event.getChannel().sendMessage("Get this bitch shakin like Parkinson's").queue();
                    break;
                case 7:
                    event.getChannel().sendMessage("Last birthday she got you a new sweater  Put it on, give her a kiss, and tell her do better").queue();
                    break;
                case 8:
                    event.getChannel().sendMessage("https://cdn.discordapp.com/attachments/312729820171730955/674087150010105879/9el9tengszd41.png\n").queue();
                    break;
                default:
            }
        }

        /* -----------
            Quotebank
           ----------- */

        //!Yasuo
        if(event.getMessage().getContentRaw().equals("!yasuo")){
            int Random = ((int)(Math.random()*65));
            switch (Random){
                case 0:
                    event.getChannel().sendMessage("Death is like the wind - always by my side.").queue();
                    break;
                case 1:
                    event.getChannel().sendMessage("No cure for fools.").queue();
                    break;
                case 2:
                    event.getChannel().sendMessage("People keep running into my blade").queue();
                    break;
                case 3:
                    event.getChannel().sendMessage("I'll give you the easy way out.").queue();
                    break;
                case 4:
                    event.getChannel().sendMessage("Kill me? You can try.").queue();
                    break;
                case 5:
                    event.getChannel().sendMessage("It's just death. Nothing serious.").queue();
                    break;
                case 6:
                    event.getChannel().sendMessage("Make it quick.").queue();
                    break;
                case 7:
                    event.getChannel().sendMessage("Don't start what I'll finish.").queue();
                    break;
                case 8:
                    event.getChannel().sendMessage("At peace with yourself? You will be.").queue();
                    break;
                case 9:
                    event.getChannel().sendMessage("Some things never dull.").queue();
                    break;
                case 10:
                    event.getChannel().sendMessage("Some mistakes you can't make twice.").queue();
                    break;
                case 11:
                    event.getChannel().sendMessage("I will not die dishonored.").queue();
                    break;
                case 12:
                    event.getChannel().sendMessage("No more running.").queue();
                    break;
                case 13:
                    event.getChannel().sendMessage("I alone decide my fate.").queue();
                    break;
                case 14:
                    event.getChannel().sendMessage("One blade, one purpose.").queue();
                    break;
                case 15:
                    event.getChannel().sendMessage("It is not yet time to die.").queue();
                    break;
                case 16:
                    event.getChannel().sendMessage("A sword's poor company for a long road.").queue();
                    break;
                case 17:
                    event.getChannel().sendMessage("My honor left a long time ago.").queue();
                    break;
                case 18:
                    event.getChannel().sendMessage("No-one is promised tomorrow.").queue();
                    break;
                case 19:
                    event.getChannel().sendMessage("Follow the wind, but watch your back.").queue();
                    break;
                case 20:
                    event.getChannel().sendMessage("This blade never gets any lighter.").queue();
                    break;
                case 21:
                    event.getChannel().sendMessage("Virtue is no more than a luxury.").queue();
                    break;
                case 22:
                    event.getChannel().sendMessage("The road to ruin is shorter than you think.").queue();
                    break;
                case 23:
                    event.getChannel().sendMessage("Sleep is for the guiltless.").queue();
                    break;
                case 24:
                    event.getChannel().sendMessage("Justice. That's a pretty word.").queue();
                    break;
                case 25:
                    event.getChannel().sendMessage("Hmph. One step ahead of the past.").queue();
                    break;
                case 26:
                    event.getChannel().sendMessage("A wanderer isn't always lost.").queue();
                    break;
                case 27:
                    event.getChannel().sendMessage("Just looking for a road home.").queue();
                    break;
                case 28:
                    event.getChannel().sendMessage("Never could stay in one place.").queue();
                    break;
                case 29:
                    event.getChannel().sendMessage("I will follow this path until the end.").queue();
                    break;
                case 30:
                    event.getChannel().sendMessage("Honor is in the heart, not the name.").queue();
                    break;
                case 31:
                    event.getChannel().sendMessage("I will not forget who I am.").queue();
                    break;
                case 32:
                    event.getChannel().sendMessage("This story is not yet finished.").queue();
                    break;
                case 33:
                    event.getChannel().sendMessage("Is a leaf's only purpose to fall?").queue();
                    break;
                case 34:
                    event.getChannel().sendMessage("Hmph... dying's the easy part.").queue();
                    break;
                case 35:
                    event.getChannel().sendMessage("The blade above all things... except a good drink.").queue();
                    break;
                case 36:
                    event.getChannel().sendMessage("Who says I can't handle my drink?").queue();
                    break;
                case 37:
                    event.getChannel().sendMessage("There are three certainties in life: honor, death, and hangovers.").queue();
                    break;
                case 38:
                    event.getChannel().sendMessage("There is only death... mine, or yours!").queue();
                    break;
                case 39:
                    event.getChannel().sendMessage("If you've come to kill me... I hope you brought friends.").queue();
                    break;
                case 40:
                    event.getChannel().sendMessage("Killing people is a bad habit... but I can't seem to quit.").queue();
                    break;
                case 41:
                    event.getChannel().sendMessage("Which weighs more, Riven? Your blade, or your past?").queue();
                    break;
                case 42:
                    event.getChannel().sendMessage("Everyone faces a reckoning, Riven.").queue();
                    break;
                case 43:
                    event.getChannel().sendMessage("You can't run from yourself, Riven... I've tried.").queue();
                    break;
                case 44:
                    event.getChannel().sendMessage("Broken sword. Broken spirit.").queue();
                    break;
                case 45:
                    event.getChannel().sendMessage("Wuju? Hmph. Never heard of it.").queue();
                    break;
                case 46:
                    event.getChannel().sendMessage("Wuju? No, I wouldn't.").queue();
                    break;
                case 47:
                    event.getChannel().sendMessage("Nice... sword... boots?").queue();
                    break;
                case 48:
                    event.getChannel().sendMessage("Scurry back to your shadows, ninja.").queue();
                    break;
                case 49:
                    event.getChannel().sendMessage("Ninjas... I hate those guys.").queue();
                    break;
                case 50:
                    event.getChannel().sendMessage("Cute mask. Your, uh, mom sew that?").queue();
                    break;
                case 51:
                    event.getChannel().sendMessage("Ton!").queue();
                    break;
                case 52:
                    event.getChannel().sendMessage("Hasag!").queue();
                    break;
                case 53:
                    event.getChannel().sendMessage("Hasagi!").queue();
                    break;
                case 54:
                    event.getChannel().sendMessage("Aseryo!").queue();
                    break;
                case 55:
                    event.getChannel().sendMessage("Face the wind!").queue();
                    break;
                case 56:
                    event.getChannel().sendMessage("Choryon!").queue();
                    break;
                case 57:
                    event.getChannel().sendMessage("Son!").queue();
                    break;
                case 58:
                    event.getChannel().sendMessage("Sorye!").queue();
                    break;
                case 59:
                    event.getChannel().sendMessage("Igei ton!").queue();
                    break;
                case 60:
                    event.getChannel().sendMessage("Sorye ge ton!").queue();
                    break;
                case 61:
                    event.getChannel().sendMessage("Wait, that technique... huh.").queue();
                    break;
                case 62:
                    event.getChannel().sendMessage("Huh, three swift strikes...").queue();
                    break;
                case 63:
                    event.getChannel().sendMessage("Another wind blade?").queue();
                    break;
                case 64:
                    event.getChannel().sendMessage("Who taught you that?").queue();
                    break;
                default:
            }

        }

        //!Yuumi
        if(event.getMessage().getContentRaw().equals("!yuumi")){
            int Random = ((int)(Math.random()*169));
            switch (Random){
                case 0:
                    event.getChannel().sendMessage("You and me, we got this!").queue();
                    break;
                case 1:
                    event.getChannel().sendMessage("More of a dog person, huh?").queue();
                    break;
                case 2:
                    event.getChannel().sendMessage("Alright! Which one of you's got great aim, and is good at chin scritches?").queue();
                    break;
                case 3:
                    event.getChannel().sendMessage("Cats make great companions! Just ask my master... who disappeared under mysterious circumstances.").queue();
                    break;
                case 4:
                    event.getChannel().sendMessage("Who's ready to risk our lives, defeat our foes, and maybe knock over some cups?").queue();
                    break;
                case 5:
                    event.getChannel().sendMessage("Tell me the game plan again. Wait. Fish! Someone has fish! Where is it?").queue();
                    break;
                case 6:
                    event.getChannel().sendMessage("So, who wants to be my best friend? ...Book, I know you're already my best friend!").queue();
                    break;
                case 7:
                    event.getChannel().sendMessage("Well, this is embarrassing!").queue();
                    break;
                case 8:
                    event.getChannel().sendMessage("Fishy fishy fish! Mmph-   Waagh!").queue();
                    break;
                case 9:
                    event.getChannel().sendMessage("You look like unscratched furniture!").queue();
                    break;
                case 10:
                    event.getChannel().sendMessage("Want a book thrown at your head?! Don't worry, Book. I would never do that.").queue();
                    break;
                case 11:
                    event.getChannel().sendMessage("Keep an eye out for red dot, Book! It's gotta be here somewhere.").queue();
                    break;
                case 12:
                    event.getChannel().sendMessage("Where's my fishy fishy fish for my dishy dishy dish?").queue();
                    break;
                case 13:
                    event.getChannel().sendMessage("Where's my fishy fish fish dish? Meow!").queue();
                    break;
                case 14:
                    event.getChannel().sendMessage("I won't lose you, Book! Not after losing Master.").queue();
                    break;
                case 15:
                    event.getChannel().sendMessage("Today we are destroyers!").queue();
                    break;
                case 16:
                    event.getChannel().sendMessage("Don't tell anyone but... I love hugs.").queue();
                    break;
                case 17:
                    event.getChannel().sendMessage("Book, float us that-a-way!").queue();
                    break;
                case 18:
                    event.getChannel().sendMessage("Where to, Book?").queue();
                    break;
                case 19:
                    event.getChannel().sendMessage("The expert huntress stalks the battlefield.").queue();
                    break;
                case 20:
                    event.getChannel().sendMessage("A river? Uh-uh! Book hates water!").queue();
                    break;
                case 21:
                    event.getChannel().sendMessage("Do not drop me! Do not drop me!").queue();
                    break;
                case 22:
                    event.getChannel().sendMessage("Naps make my magic stronger! It's true! Look!   I'm so strong, mmh, so strong!").queue();
                    break;
                case 23:
                    event.getChannel().sendMessage("Hey Book, do you ever take a nap? ...You can't?! What do you do all day?!").queue();
                    break;
                case 24:
                    event.getChannel().sendMessage("Book, sometimes I pretend you're just a nice comfy box! ...What? That's a compliment!").queue();
                    break;
                case 25:
                    event.getChannel().sendMessage("The Book-keeper is a great role for someone as responsible as me! ...What?").queue();
                    break;
                case 26:
                    event.getChannel().sendMessage("I save my friends? No one notices. I open a teensy portal to the spirit realm? Everyone is up in my fur!").queue();
                    break;
                case 27:
                    event.getChannel().sendMessage("If I didn't have to protect Book, I'd just be a normal magical cat floating around Bandle City! Okay, napping around Bandle City.").queue();
                    break;
                case 28:
                    event.getChannel().sendMessage("I've read all of Book. Well, most of Book. I like the pictures of fish... of which there are none, Book!").queue();
                    break;
                case 29:
                    event.getChannel().sendMessage("Ah, I miss the way my yordle scratched between my ears. ...Being read from cover to cover sounds nice too.").queue();
                    break;
                case 30:
                    event.getChannel().sendMessage("Hmm, today should I follow my head? Or my nose, or.. OH! Sunbeam ahead! Let's chase that!").queue();
                    break;
                case 31:
                    event.getChannel().sendMessage("Someone scratched out the page that led here! That's right, Book. Someone! We'll never know who.").queue();
                    break;
                case 32:
                    event.getChannel().sendMessage("If I ever lost you, Book, the fabric of the spirit realm would get all torn up! And I'd lose my best friend.").queue();
                    break;
                case 33:
                    event.getChannel().sendMessage("I'm descended from lions! And you're descended from trees! We're in our element, Book!").queue();
                    break;
                case 34:
                    event.getChannel().sendMessage("Get ready to face the mighty Yuumi! Oh, and Book.").queue();
                    break;
                case 35:
                    event.getChannel().sendMessage("RAWR!!!   ...'scuse me.").queue();
                    break;
                case 36:
                    event.getChannel().sendMessage("Wow, so you're in charge of the giant litter box, huh, bird guy?").queue();
                    break;
                case 37:
                    event.getChannel().sendMessage("Hey,  Kog'Maw! I like coughing things up too!").queue();
                    break;
                case 38:
                    event.getChannel().sendMessage("The expert huntress stalks the battlefield.").queue();
                    break;
                case 39:
                    event.getChannel().sendMessage("You can't have Book, large metal cat!").queue();
                    break;
                case 40:
                    event.getChannel().sendMessage("Book, you've got it backward. You said Nasus was a god! But he's just a dog.").queue();
                    break;
                case 41:
                    event.getChannel().sendMessage("Oh wow, hook man! Someone who can actually fish!").queue();
                    break;
                case 42:
                    event.getChannel().sendMessage("Oh, so you're Xayah's pet!").queue();
                    break;
                case 43:
                    event.getChannel().sendMessage("Tell me, Rengar! How do you groom all that fur?").queue();
                    break;
                case 44:
                    event.getChannel().sendMessage("Teemo? I bet I can eat that guy! Bet I can eat him.").queue();
                    break;
                case 45:
                    event.getChannel().sendMessage("Rats? I'm against them. Extremely bad.").queue();
                    break;
                case 46:
                    event.getChannel().sendMessage("Make your shinylight glow, Vel'Koz! I wanna chase it!").queue();
                    break;
                case 47:
                    event.getChannel().sendMessage("The red... dot... belongs to YOU?!").queue();
                    break;
                case 48:
                    event.getChannel().sendMessage("RAWR! That's how bears talk.").queue();
                    break;
                case 49:
                    event.getChannel().sendMessage("My purr is louder than your growl, dog.").queue();
                    break;
                case 50:
                    event.getChannel().sendMessage("Yeah, you birds can fly! Well, so can cats! This cat.").queue();
                    break;
                case 51:
                    event.getChannel().sendMessage("I'm gonna eat all your leaves and throw 'em up!").queue();
                    break;
                case 52:
                    event.getChannel().sendMessage("Here, fishy fishy fishy! Meow!").queue();
                    break;
                case 53:
                    event.getChannel().sendMessage("Have you seen my master? She's about your size.").queue();
                    break;
                case 54:
                    event.getChannel().sendMessage("Book doesn't like you.").queue();
                    break;
                case 55:
                    event.getChannel().sendMessage("Claws out!").queue();
                    break;
                case 56:
                    event.getChannel().sendMessage("You're in bite range!").queue();
                    break;
                case 57:
                    event.getChannel().sendMessage("Get your own book!").queue();
                    break;
                case 58:
                    event.getChannel().sendMessage("Swat, swat!").queue();
                    break;
                case 59:
                    event.getChannel().sendMessage("Bop!").queue();
                    break;
                case 60:
                    event.getChannel().sendMessage("The ol' pounce and scratch!").queue();
                    break;
                case 61:
                    event.getChannel().sendMessage("Like a tiger.").queue();
                    break;
                case 62:
                    event.getChannel().sendMessage("Scritchy scratch!").queue();
                    break;
                case 63:
                    event.getChannel().sendMessage("Attack-pounce!").queue();
                    break;
                case 64:
                    event.getChannel().sendMessage("Hiyah!").queue();
                    break;
                case 65:
                    event.getChannel().sendMessage("Oh, I am SO knocking that over!").queue();
                    break;
                case 66:
                    event.getChannel().sendMessage("Grr, stupid overgrown scratching post!").queue();
                    break;
                case 67:
                    event.getChannel().sendMessage("I hiss at you, giant pile of stones! Hiss!").queue();
                    break;
                case 68:
                    event.getChannel().sendMessage("You smell tasty!").queue();
                    break;
                case 69:
                    event.getChannel().sendMessage("You smell kinda like my Yordle!").queue();
                    break;
                case 70:
                    event.getChannel().sendMessage("So does your gauntlet help you pet more cats?").queue();
                    break;
                case 71:
                    event.getChannel().sendMessage("Ooh, you're warm! ...Anyone smell burning fur?").queue();
                    break;
                case 72:
                    event.getChannel().sendMessage("I hear you're red dot's master!").queue();
                    break;
                case 73:
                    event.getChannel().sendMessage("Ooh, can I climb up on your spike thingies?").queue();
                    break;
                case 74:
                    event.getChannel().sendMessage("After this, can you play the piano while I nap, Jhin?").queue();
                    break;
                case 75:
                    event.getChannel().sendMessage("Did somebody say FISHbone?").queue();
                    break;
                case 76:
                    event.getChannel().sendMessage("Don't worry! Specters have nothing on magic cats.").queue();
                    break;
                case 77:
                    event.getChannel().sendMessage("Grr! I'm a mountain lion!").queue();
                    break;
                case 78:
                    event.getChannel().sendMessage("Ah, I see you have the loud thing, to scare off the enemy!").queue();
                    break;
                case 79:
                    event.getChannel().sendMessage("Ugh! You smell like dog!").queue();
                    break;
                case 80:
                    event.getChannel().sendMessage("Just two cats, out on the town.").queue();
                    break;
                case 81:
                    event.getChannel().sendMessage("Has there ever been a cat Aspect, Pantheon?").queue();
                    break;
                case 82:
                    event.getChannel().sendMessage("Book, meet giant scroll!").queue();
                    break;
                case 83:
                    event.getChannel().sendMessage("Spirit realm, here we come!").queue();
                    break;
                case 84:
                    event.getChannel().sendMessage("Okay, okay... we can make this work!").queue();
                    break;
                case 85:
                    event.getChannel().sendMessage("Ouch! See you in your next life!").queue();
                    break;
                case 86:
                    event.getChannel().sendMessage("On to the next friend.").queue();
                    break;
                case 87:
                    event.getChannel().sendMessage("Hang on, Book. ...I am hanging on!").queue();
                    break;
                case 88:
                    event.getChannel().sendMessage("I love this paaaaaaaart!").queue();
                    break;
                case 89:
                    event.getChannel().sendMessage("Woo! Here we goooooooo!").queue();
                    break;
                case 90:
                    event.getChannel().sendMessage("I'll stick with you!").queue();
                    break;
                case 91:
                    event.getChannel().sendMessage("I guess we're going this-a-way.").queue();
                    break;
                case 92:
                    event.getChannel().sendMessage("Ooh! Ooh! Get him! Ooh!!").queue();
                    break;
                case 93:
                    event.getChannel().sendMessage("We'll bite you!").queue();
                    break;
                case 94:
                    event.getChannel().sendMessage("Yeah! What they said!").queue();
                    break;
                case 95:
                    event.getChannel().sendMessage("Use your claws! Your CLAWS!").queue();
                    break;
                case 96:
                    event.getChannel().sendMessage("Lets slice 'em!").queue();
                    break;
                case 97:
                    event.getChannel().sendMessage("Now kill 'em! KILL 'EM!").queue();
                    break;
                case 98:
                    event.getChannel().sendMessage("Do the secret five claw technique!").queue();
                    break;
                case 99:
                    event.getChannel().sendMessage("Quick, lay on your back and kick 'em!").queue();
                    break;
                case 100:
                    event.getChannel().sendMessage("Watch out for us!").queue();
                    break;
                case 101:
                    event.getChannel().sendMessage("Cat-tack!").queue();
                    break;
                case 102:
                    event.getChannel().sendMessage("We got this? We got this.").queue();
                    break;
                case 103:
                    event.getChannel().sendMessage("Do the bite-y thing! Yeah, that one!").queue();
                    break;
                case 104:
                    event.getChannel().sendMessage("We did it! We knocked 'em over!").queue();
                    break;
                case 105:
                    event.getChannel().sendMessage("Do you want me to bury that?").queue();
                    break;
                case 106:
                    event.getChannel().sendMessage("Woohoo! Now I can bat around the body!").queue();
                    break;
                case 107:
                    event.getChannel().sendMessage("We're killing buddies!").queue();
                    break;
                case 108:
                    event.getChannel().sendMessage("The power of friendship!").queue();
                    break;
                case 109:
                    event.getChannel().sendMessage("This way! No THIS way! Woah-kay, that way it is.").queue();
                    break;
                case 110:
                    event.getChannel().sendMessage("I'm like your ghost! WooOOooh!").queue();
                    break;
                case 111:
                    event.getChannel().sendMessage("They aren't ready for the ferocious team of... US!").queue();
                    break;
                case 112:
                    event.getChannel().sendMessage("You can pet me on my chin and back! Nowhere else. Mrow.").queue();
                    break;
                case 113:
                    event.getChannel().sendMessage("Do you have snacks in your pocket? How 'bout now? ...How 'bout now?!").queue();
                    break;
                case 114:
                    event.getChannel().sendMessage("Faster! Faster!").queue();
                    break;
                case 115:
                    event.getChannel().sendMessage("Is it time to save our friends again?").queue();
                    break;
                case 116:
                    event.getChannel().sendMessage("Ooh, you smell good! Did you recently fish?").queue();
                    break;
                case 117:
                    event.getChannel().sendMessage("Mush, mush! Wheeeeheehee!").queue();
                    break;
                case 118:
                    event.getChannel().sendMessage("I could tell you wanted a brave and powerful warrior by your side.").queue();
                    break;
                case 119:
                    event.getChannel().sendMessage("Do you ever get so sleepy you fall asleep sitting up? Just me?").queue();
                    break;
                case 120:
                    event.getChannel().sendMessage("Okay, it's time to prowl! You do know how to prowl, right?").queue();
                    break;
                case 121:
                    event.getChannel().sendMessage("Rubbing my head on you means you're mine!").queue();
                    break;
                case 122:
                    event.getChannel().sendMessage("If we find a rat, I call dibs! Or a bug. Or a FISH!").queue();
                    break;
                case 123:
                    event.getChannel().sendMessage("Wherever you go, I go! Just... don't go somewhere bad.").queue();
                    break;
                case 124:
                    event.getChannel().sendMessage("The only thing standing between us and lunch is... our enemies.").queue();
                    break;
                case 125:
                    event.getChannel().sendMessage("I am the brains, you are the brawn, Book... is Book!").queue();
                    break;
                case 126:
                    event.getChannel().sendMessage("In case you're wondering what that smell is, it's Book. Smells like old trees.").queue();
                    break;
                case 127:
                    event.getChannel().sendMessage("Don't worry, I'll be here through thick or thin! Unless I smell fish. Gasp- Do you have fish?!").queue();
                    break;
                case 128:
                    event.getChannel().sendMessage("Hey, new friend? Uh, warn me if you're going to do something crazy, okay?").queue();
                    break;
                case 129:
                    event.getChannel().sendMessage("Don't get too attached, Book! This one looks reckless...").queue();
                    break;
                case 130:
                    event.getChannel().sendMessage("Hey. Hey. Hey. HEY! ...Huh? Oh no, I don't need anything!").queue();
                    break;
                case 131:
                    event.getChannel().sendMessage("You hungry? I stuck a leftover rat on page 237! Mew!").queue();
                    break;
                case 132:
                    event.getChannel().sendMessage("Do you know what \"vexatious\" means? Book called me that and I think it might be mean.").queue();
                    break;
                case 133:
                    event.getChannel().sendMessage("If someone told you to jump in a lake, would you do it? Just 'cause... I go where you go.").queue();
                    break;
                case 134:
                    event.getChannel().sendMessage("I bet we'll be friends forever! Well, unless you wander into the brush with your face.").queue();
                    break;
                case 135:
                    event.getChannel().sendMessage("I have the best aim in the spirit realm!").queue();
                    break;
                case 136:
                    event.getChannel().sendMessage("Zoooooom!").queue();
                    break;
                case 137:
                    event.getChannel().sendMessage("Book, meet new friend!").queue();
                    break;
                case 138:
                    event.getChannel().sendMessage("I'm Yuumi, and you're warm!").queue();
                    break;
                case 139:
                    event.getChannel().sendMessage("So, you need a new shield buddy?").queue();
                    break;
                case 140:
                    event.getChannel().sendMessage("I love keeping my friends alive.").queue();
                    break;
                case 141:
                    event.getChannel().sendMessage("I've got a good feeling about this one, Book!").queue();
                    break;
                case 142:
                    event.getChannel().sendMessage("I'll protect you with my wild and furious... meow!").queue();
                    break;
                case 143:
                    event.getChannel().sendMessage("It's just you and me, Book!").queue();
                    break;
                case 144:
                    event.getChannel().sendMessage("I'm an independent cat.").queue();
                    break;
                case 145:
                    event.getChannel().sendMessage("Back on my own! Meow!").queue();
                    break;
                case 146:
                    event.getChannel().sendMessage("Time to find a new friend!").queue();
                    break;
                case 147:
                    event.getChannel().sendMessage("We got the zoomies!").queue();
                    break;
                case 148:
                    event.getChannel().sendMessage("Now you're ready to prowl!").queue();
                    break;
                case 149:
                    event.getChannel().sendMessage("Wooooo!").queue();
                    break;
                case 150:
                    event.getChannel().sendMessage("Go go go go GO GO GO!").queue();
                    break;
                case 151:
                    event.getChannel().sendMessage("THIS IS MY FAVORITE CHAPTER!!").queue();
                    break;
                case 152:
                    event.getChannel().sendMessage("I am TOTALLY doing this!").queue();
                    break;
                case 153:
                    event.getChannel().sendMessage("I AM THE MOST MAGIIIIC!").queue();
                    break;
                case 154:
                    event.getChannel().sendMessage("Get your own book!").queue();
                    break;
                case 155:
                    event.getChannel().sendMessage("Oh! I thought we were playing! Are you DEAD?!").queue();
                    break;
                case 156:
                    event.getChannel().sendMessage("I did it! I knocked it over!").queue();
                    break;
                case 157:
                    event.getChannel().sendMessage("Squashed like a bug!").queue();
                    break;
                case 158:
                    event.getChannel().sendMessage("I bopped them all!").queue();
                    break;
                case 159:
                    event.getChannel().sendMessage("Wow, even brighter than my shinylight!").queue();
                    break;
                case 160:
                    event.getChannel().sendMessage("Heehee! They're never gonna see us coming!").queue();
                    break;
                case 161:
                    event.getChannel().sendMessage("Goodbye to the darkness!").queue();
                    break;
                case 162:
                    event.getChannel().sendMessage("I tried your thing, Book. Now let's try my thing: napping!").queue();
                    break;
                case 163:
                    event.getChannel().sendMessage("Ever pretend you're part of the floor? I do.").queue();
                    break;
                case 164:
                    event.getChannel().sendMessage("No, no, no! We can fix this!").queue();
                    break;
                case 165:
                    event.getChannel().sendMessage("Book, what's happening to you?").queue();
                    break;
                case 166:
                    event.getChannel().sendMessage("Book, keep your light on!").queue();
                    break;
                case 167:
                    event.getChannel().sendMessage("Is it time to save the world again?").queue();
                    break;
                case 168:
                    event.getChannel().sendMessage("It's okay, we've got 6 left... or was it 5?").queue();
                    break;
                default:
            }

        }










    }
}
