//
//  ViewController.swift
//  largerText
//
//  Created by Pieter Vandendriessche on 01/05/2019.
//  Copyright © 2019 Pieter Vandendriessche. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var arialLabel: UILabel!
    override func viewDidLoad() {
        super.viewDidLoad()
 
        //Ophalen van lettertype
        var lettertypeVanLabel = arialLabel.font!
        //Schalen van bestaande lettertype
        var geschaaldLettertype = UIFontMetrics(forTextStyle: .body).scaledFont(for: lettertypeVanLabel)
       arialLabel.font = geschaaldLettertype
        
        //Reageren op aanpassingen in schaal (Dynamic type)
       arialLabel.adjustsFontForContentSizeCategory = true
    }
    
    


}

