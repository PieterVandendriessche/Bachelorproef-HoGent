//
//  ViewController.swift
//  AnimationSample
//
//  Created by Pieter Vandendriessche on 02/05/2019.
//  Copyright © 2019 Pieter Vandendriessche. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    override func viewDidLoad() {
        super.viewDidLoad()
        // Do any additional setup after loading the view.
    }

    @IBAction func beginAnimatie(_ sender: Any) {
        let vierkant = UIView(frame: CGRect(x: 75,y: 75,width: 75,height: 75))
        vierkant.backgroundColor = UIColor.orange
        view.addSubview(vierkant)
        
        //Nagaan of optie is geactiveerd
        if !UIAccessibility.isReduceMotionEnabled {
            //Animeer
            UIView.animate(withDuration: 2.0) {
                vierkant.frame.origin = CGPoint(x: 75, y: 300)
            }
        }
    }

}

