(ns norman-sicily-static.index)

(defn render-page
  []
  [:div {:class "container"}
   [:div {:class "row"}
    [:div {:class "col-lg-12"}
     [:div {:class "center-block", :style "width:712px;height:400px;"}
      [:iframe {:style "overflow:hidden;height:100%;width:100%",
                :width "100%",
                :height "100%",
                :src "http://www.youtube.com/embed/0brgzGyg59s?rel=0&modestbranding=1&showinfo=0",
                :frameborder "0",
                :allowfullscreen true,
                :data-trigger "hover focus"
                :data-container "body",
                :data-toggle "popover",
                :data-placement "right",
                :data-content "Detail from Muhammad al-Idrīsī's world map contained in the twelfth-century <em>Kitāb nuzhat al-mushtāq fī ikhtirāq al-āfāq</em> (<em>The Pleasure Excursion of One Who Is Eager to Traverse the Regions of the World</em>), whose title Idrīsī later changed to <em>Kitab Rujar</em> (<em>Book of Roger</em>), which contained what was perhaps the most accurate map of the medieval world. The selection is an illustration of Sicily and Southern Italy. The orientation appears to be upside down because south is located at the top of the map in accordance with the cartographic conventions of the <em>Balkhī</em> school of geography."}]]]]])
