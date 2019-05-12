Button knop = (Button) mLayout.findViewById(R.id.knop);
   knop.setOnClickListener(new View.OnClickListener() {
       public void onClick(View view) {
           //Triggert het uitschakelen van toestel (dialoog)
           performGlobalAction(GLOBAL_ACTION_POWER_DIALOG);
       }
   });
