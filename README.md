# SlidePage-use-ViewPager2
This is a sample of how to create the easy of slide page and use ViewPager2 and Fragment.

## Demo Video :

![materialdots](https://media.giphy.com/media/Uy0ckJVoA3QivZOYa1/giphy.gif)


## TO DO :


- The first stage, we have to create a project first. Create a new project with a name Slide Page
- Import first the gradle from the view pager 2

  ```implementation "androidx.viewpager2:viewpager2:1.0.0"```
- Import gradle from this github to use dots indicator for slide page . Below is link to get gradle
  
  ``https://github.com/tommybuonomo/dotsindicator``
  
  in this project, we use this dots and also the gradle that we use
  
  ![ezgif com-crop 1](https://user-images.githubusercontent.com/15737675/38328329-e7008c06-384a-11e8-8449-9f2e396d2bc5.gif) 
  
  ``implementation 'com.tbuonomo.andrui:viewpagerdotsindicator:4.1.2'``
  
 - Import the assets we need, such as the font used (this project uses Ubuntu font) and the images in the layout
 - Add some code to `string.xml`, create a drawable shape for the button background `ic_button_background.xml` and edit the text `ic_et_background.xml`on the layout
 - Add some code to activity `slide_page.xml` 
 - Then we create the `ViewPageAdapter.kt` adapter class to associate the viewpager with the fragment. We'll be creating a custom adapter that extends from the `FragmentPagerAdapter class`
 -create an activity fragment class `FragmentSlide` use blank fragment, where this fragment contains the pages that will be displayed in an activity. Here creates a fragment that extends from the `fragment class`. Then edit the layout `Fragment_slide.xml`, after that add some code to `FragmentSlide.kt`
 - Don't forget to create a new activity to display the input name by naming the activity as `MainActivity`. Add code in `MainActivity.xml`
 - Add an adapter for the pager that uses ViewPager2 in the `SlidePage.kt`
 - Add some code in `SlidePage` for `btnNext and btnFinish` to slide page one by one and send name data from `SlidePage activity` into `MainActivity`. Don't forget to add code for send data use
 
    `putExtra("dataName", name)`
 - the last, add code in `MainActivity.kt` to show name data from `SlidePage Activity` use 
 
    `val dataName = intent.extras?.getString("dataName")`
 
    `name.text="Hi $dataName,"`
  
