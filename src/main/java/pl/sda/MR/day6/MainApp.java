package pl.sda.MR.day6;

import java.util.List;

public class MainApp {
    public static void main(String[] args) {


        //  Example.streamExample();

        // Zad1

        String words = "wary,profuse,thankful,sparkle,absurd,steam,examine,material,thank,tub,stingy,tour,magical," +
                "land,fail,wacky,influence,unpack,subdued,peck,rainstorm,team,snails,vagabond,nosy,grouchy,measly," +
                "careless,agree,wanting,suppose,tight,permit,happy,selfish,alarm,messy,ducks,retire,stamp," +
                "high-pitched,habitual,miniature,squeamish,reply,discussion,shrill,damage,railway,order,evasive," +
                "cakes,jar,fast,naive,marked,bikes,misty,willing,crook,wistful,kiss,bright,store,religion,reign," +
                "toothbrush,spectacular,tacit,tenuous,mountainous,expand,bushes,flap,rambunctious,possible,waggish," +
                "childlike,horrible,alive,screw,goofy,inform,truck,theory,drip,alleged,secretary,clean,apathetic," +
                "note,nose,relieved,married,stiff,vase,spotless,nose,direful,form,bright,cellar,pretend,dirty,mind," +
                "rest,nerve,pear,grass,abnormal,sweater,cheap,shave,digestion,few,transport,secretive,waves,refuse," +
                "venomous,metal,value,doll,van,toe,attend,produce,truck,difficult,sticks,utopian,premium,memory," +
                "common,curtain,determined,wary,scattered,winter,grubby,present,big,bruise,towering,muddle,pin,ink," +
                "standing,pipe,successful,dull,pear,thought,tomatoes,women,bathe,grade,feigned,giraffe,uncle,watch," +
                "extra-large,lip,gusty,ugly,icy,outstanding,lock,relation,uncovered,productive,grape,messup," +
                "lamentable,useful,brush,pour,hurried,encourage,obeisant,things,trick,tree,easy,jumbled,fire," +
                "fluttering,green,throat,ragged,soak,unite,gun,miss,overrated,milky,quince,furtive,low,linen,massive," +
                "tour,tidy,fit,fearful,naughty,correct,dress,relieved,ritzy,harmonious,fowl,nine,respect,road,absent," +
                "gainful,remember,spotty,youthful,bird,unused,love,garrulous,thank,dirt,amusement,greedy,list,cannon," +
                "pie,sour,meeting,low,efficacious,celery,harmony,practise,many,mixed,tearful,lean,crook,insidious," +
                "knotty,number,cent,ordinary,flowery,snakes,paste,crazy,yawn,foolish,jittery,poised,back,frequent," +
                "poke,double,settle,red,delightful,collar,bikes,cabbage,hook,scribble,fragile,devilish,truthful," +
                "gifted,aloof,drum,glorious,hard-to-find,apathetic,death,air,concern,miscreant,alike,explode,kneel," +
                "stuff,honey,nauseating,coil,excuse,unwritten,coat,way,quicksand,romantic,idea,fluttering,try," +
                "ambiguous,obey,dad,driving,dazzling,gun,second-hand,perpetual,zoom,stem,laughable,eminent,ocean," +
                "belligerent,beautiful,roof,highfalutin,frightened,black,far,crazy,cannon,property,reflect," +
                "grandfather,linen,eight,faithful,lean,helpful,volleyball,admire,ill,rampant,concern,bored,fang," +
                "raspy,excited,null,bells,receipt,efficient,abstracted,greet,border,bury,stupid,dynamic,thoughtless," +
                "humdrum,gruesome,trashy,icicle,honorable,false,beautiful,abounding,hospitable,quaint,necessary," +
                "trade,classy,grab,lean,class,scandalous,live,precede,dirt,scratch,fix,fumbling,married,market," +
                "rabbits,hulking,title,caption,colour,devilish,nation,rain,basket,bikes,loutish,lighten,hateful," +
                "eight,milky,camera,enter,race,development,airplane,prick,busy,blue,hair,clammy,clap,cow,smile,scare," +
                "steer,fowl,invention,appear,flow,lie,sack,boot,answer,pass,few,realise,ugliest,pale,quartz,tawdry," +
                "trick,buzz,aftermath,bead,air,whistle,wall,hammer,crooked,profit,rings,birth,tub,cannon,coherent," +
                "defiant,finger,kettle,haircut,pack,onerous,lopsided,full,coast,joyous,carpenter,arithmetic,prepare," +
                "scientific,old-fashioned,abstracted,army,flowers,health,rainy,four,diligent,nappy,pollution,husky," +
                "secretive,mind,squeamish,dashing,outgoing,jealous,brush,crown,few,chew,beam,nose,mean,many,agree," +
                "throne,neck,fluffy,harsh,sincere,bat,ear,loose,carpenter,polish,sweet,equal,sulky,show,political," +
                "exotic,laugh,optimal,hammer,utopian,outgoing,pray,dad,relation,trace,full,plausible,impolite,dress," +
                "bolt,grape,useless,deer,cultured,race,pack,nest,staking,group,melt,thoughtless,bang,fair,weigh,wry," +
                "incredible,earn,panoramic,visitor,impolite,trust,end,launch,zip,colossal,numerous,naughty,tall," +
                "aback,roll,extra-large,wave,round,sudden,society,fluttering,pet,plane,scintillating,upbeat," +
                "treatment,education,comb,blink,tiny,drum,snotty,divide,duck,cooing,letters,correct,fierce,royal," +
                "talk,nation,analyse,deafening,zephyr,retire,share,mitten,infamous,rambunctious,enter,object,owe," +
                "witty,warm,pumped,throne,assorted,zealous,silk,night,pack,jagged,overrated,sort,mind,cloistered,tug," +
                "crowd,violet,marble,null,clammy,overwrought,writer,breakable,warm,plain,itch,curly,accidental," +
                "fertile,one,scent,found,sigh,adjoining,hushed,deep,doubtful,store,curtain,brick,crown,charge," +
                "oceanic,sudden,heady,communicate,noiseless,hellish,type,handle,x-ray,sin,rose,abusive,flagrant," +
                "redundant,snake,juice,equal,charming,hollow,elbow,detail,deranged,roof,resolute,shivering,house," +
                "hard-to-find,black-and-white,bell,shivering,yard,nutritious,thunder,ticket,spicy,stream,cure,reason," +
                "trail,roomy,concerned,dance,writer,dear,gruesome,consider,recognise,lush,mailbox,stove,marry," +
                "painstaking,bounce,gusty,value,wrestle,homely,abstracted,wheel,window,grandmother,recess,position," +
                "roll,juvenile,stone,giant,own,large,peep,sofa,stretch,clip,meek,high,lean,plant,obese,giants,rare," +
                "spot,extra-small,birthday,trains,elastic,selective,run,rat,measure,chop,earthy,undesirable,foolish," +
                "male,unique,dress,sedate,insect,expect,hanging,endurable,behave,credit,distinct,blushing,fortunate," +
                "impossible,true,concerned,bare,furtive,aware,bright,development,stomach,shocking,scarecrow," +
                "glamorous,obnoxious,locket,animal,bee,songs,gather,bone,vegetable,edge,vigorous,appliance,crime," +
                "decorate,smile,sable,drab,repair,title,field,ruthless,heal,throat,peaceful,wax,rain,skate,dress," +
                "drop,cooing,holistic,contain,robin,extra-small,whole,coal,head,tight,future,sigh,tasteless,compare," +
                "earthquake,card,continue,oven,feigned,head,suck,claim,seal,pleasure,greedy,awful,drown,loss,car," +
                "peel,crime,rub,lace,string,foregoing,x-ray,mute,flawless,wicked,sulky,planes,flight,ugliest," +
                "agreeable,easy,introduce,cautious,black,wiry,gather,arm,fantastic,fixed,expansion,incredible," +
                "aromatic,holiday,pen,reason,neck,brash,rhythm,two,ruthless,visit,probable,sink,trip,attractive," +
                "borrow,program,alive,can,onerous,load,idiotic,obese,excite,ear,overconfident,size,guttural,slim," +
                "elderly,scratch,loutish,pleasant,trip,futuristic,gather,bee,lumber,faint,volatile,sleep,dog,beds," +
                "symptomatic,smoggy,raspy,collar,carriage,pets,clover,overrated,frogs,wretched,trains,tasteless," +
                "boundless,wrong,spy,division,claim,afternoon,hole,faulty,increase,sun,page,industrious,poor,aunt," +
                "remove,phobic,serious,hallowed,blue,rude,reaction,force,wing,memorise,disappear,range,outstanding," +
                "obey,utter,awful,lovely,permissible,share,ajar,opposite,jealous,yard,rings,lackadaisical,voice," +
                "placid,pushy,writer,nervous,morning,secret,dizzy,panicky,puny,big,dime,welcome,sand,stuff,third," +
                "ants,number,idiotic,ladybug,chilly,luxuriant,rely,trot,wrestle,view,thing,improve,fair,lowly,snatch," +
                "work,dog,count,snow,food,whole,plate,curious,carriage,snow,spell,reason,erratic,cold,damaging," +
                "measure,delirious,wasteful,frequent,trot,profit,lazy,seashore,decorous,stove,basin,profuse,check," +
                "request,town,spray,view,plants,alive,inexpensive,horrible,current,bake,try,placid,enter,explode," +
                "form,worthless,object,needy,dispensable,bead,meat,plant,ugliest,racial,side,encourage,pray," +
                "permissible,brave,learned,well-made,nutritious,prefer,print,far-flung,righteous,frame,calendar,next," +
                "prepare,mitten,wink,inexpensive,complete,knowledge,damage,arrogant,mute,test,corn,shape,rhyme,x-ray," +
                "breakable,spotted,enjoy,oranges,wait,misty,impulse,ritzy,colorful,leg,water,thought,absorbed," +
                "applaud,expensive,calendar,extend,oceanic,boundary,ethereal,birds,wax,trot,idea,teaching,sleet," +
                "apparel,giraffe,x-ray,snow,victorious,harmonious,zipper,cluttered,invincible,nutritious,tranquil," +
                "meeting,mountainous,toothsome,weather,enter,unpack,succeed,type,moon,kind,grotesque,motionless," +
                "didactic,cherries,refuse,permit,planes,action,tug,knowledgeable,nimble,damaging,disagreeable,lucky," +
                "help,riddle,bit,men,gate,flowers,faithful,obeisant,rough,rob,eager,awake,coil,hungry,fat,tap," +
                "observation,jolly,brush,suspend,flame,prepare,class,kettle,abject,frightening,number,exchange,jog," +
                "observant,combative,produce,scary,wiry,broken,moon,drawer,kill,found,crabby,cowardly,reduce,fast," +
                "arithmetic,porter,seal,vein,stuff,blind,damaged,screw,painstaking,best,scissors,gratis,feigned," +
                "queen,tearful,lying,amusing,damaging,vest,magenta,discovery,tired,shrug,curious,volcano,tow," +
                "abrasive,minister,pinch,mint,foamy,beginner,superb,rare,discreet,angle,gather,change,helpless," +
                "mellow,flaky,injure,frantic,expansion,harbor,available,spotty,love,wood,messup,zoo,blush,pest,trust," +
                "basket,assorted,fancy,sloppy,repair,necessary,conscious,fair,relax,untidy,science,even,oafish," +
                "position,ugliest,giddy,joke,horse,deserted,sand,cake,collar,rest,bury,wide,belong";

        WordProvider.provide(words);
        // znajduje słowa na litere a

        WordProvider.finder(words, "a");
        System.out.println("Words on demanded letter: " + WordProvider.finder(words, "a"));

        // wybiera tyko te słowa, których długośc jest mniejsza niż 4
        System.out.println("Trimmed words (no longer than 4 letters): "+ WordProvider.wordsTrimmer(words, "a"));


    }
}
