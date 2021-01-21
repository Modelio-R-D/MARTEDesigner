package org.modelio.module.marte.profile.grm.propertys;

import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.eclipse.swt.events.MouseAdapter;
import org.eclipse.swt.events.MouseEvent;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.TransformationDialog;
import org.modelio.module.marte.profile.utils.LinkManager;
import org.modelio.module.marte.profile.utils.ModelUtils;

@objid ("9205fc65-290c-4aee-9346-e533aacbf651")
public class ListenerCommunicationMedia_BTP extends MouseAdapter {
    @objid ("9a7ace27-25e8-49db-9164-e72bfdd1d62b")
    private CommunicationMedia_BodyTreePage body;

    @objid ("b056a942-a335-4b14-83b3-9b585a0efcfc")
    private ModelElement element;

    @objid ("0bc77d83-a0c9-4c1b-87a3-6b5a133ff933")
    public ListenerCommunicationMedia_BTP(TransformationDialog dialog, CommunicationMedia_BodyTreePage body, ModelElement element) {
        this.body = body;
        this.element = element;
        dialog.getFinishButton().addMouseListener(this);
    }

    @objid ("8fb04131-8d8d-4149-95f5-2c5b287565ed")
    public void mouseUp(MouseEvent e) {
        if (this.body.getResMult() != null) {
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT, this.body.getResMult());
        }
        
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED, this.body.getIsProtected());
        
        ModelUtils.addBooleanValue(this.element, MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE, this.body.getIsActive());
        
        if (this.body.getElementSize() != null) {
            ModelUtils.addStringValue( this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE, this.body.getElementSize());
        }
        
        ModelUtils.addStringValue( this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE, this.body.getTransmMode());
        
        ModelUtils.addMultipleStringValue( this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT, this.body.getBlockT());
        
        ModelUtils.addMultipleStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT, this.body.getPacketT());
        
        ModelUtils.addMultipleStringValue(this.element, MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY, this.body.getCapacity());
        
        //LinkManager.removeAllLinks(element, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        
        //for (String s : body.getCapacity()) {
            //Classifier cap = (Classifier)ModelUtils.searchElement(Classifier.class, MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER).getElementOfName(s);
            //LinkManager.addLink(element, cap, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
               // }
        
        if (this.body.getSpeedFactor() != null) {
            ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR, this.body.getSpeedFactor());
        }
        
        ModelUtils.addStringValue(this.element, MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER, this.body.getMainScheduler());
        
        if (!this.body.getMainScheduler().equals("")) {
            Classifier mainScheduler = (Classifier)ModelUtils.searchElement(Classifier.class, MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER).getElementOfName(this.body.getMainScheduler());
            LinkManager.setLink(this.element, mainScheduler, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        }
        else {
            LinkManager.removeLink(this.element, MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        }
        this.body.getDialog().dispose();
    }

}
