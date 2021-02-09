package org.modelio.module.marte.profile.grm.propertys;

import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Text;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.MARTEDesignerStereotypes;
import org.modelio.module.marte.api.MARTEDesignerTagTypes;
import org.modelio.module.marte.profile.editors.BodyTreePage;
import org.modelio.module.marte.profile.editors.TransformationDialog;
import org.modelio.module.marte.profile.nfps.model.ComplexTree_NFP_DataTxRate;
import org.modelio.module.marte.profile.nfps.model.ComplexTree_NFP_Duration;
import org.modelio.module.marte.profile.utils.ModelUtils;

public class CommunicationMedia_BodyTreePage extends BodyTreePage {
    private ComplexTree_NFP_DataTxRate complex_capacity;

    private ComplexTree_NFP_Duration complex_blockT;

    private ComplexTree_NFP_Duration complex_packetT;

    private Text resMult;

    private Button isProtected;

    private Button isActive;

    private Text elementSize;

    private Combo transmMode;

    private Text speedFactor;

    private Combo mainScheduler;

    public CommunicationMedia_BodyTreePage(TransformationDialog dialog, ModelElement element) {
        /*
         * the tag types List<MObject> names has to be created here.
         */
        String[] listTagTypes = new String[] {
                MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_RESMULT,
                MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISPROTECTED,
                MARTEDesignerTagTypes.RESOURCE_CLASSIFIER_RESOURCE_CLASSIFIER_ISACTIVE,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_ELEMENTSIZE,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_TRANSMMODE,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_BLOCKT,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_PACKETT,
                MARTEDesignerTagTypes.COMMUNICATIONMEDIA_CLASSIFIER_COMMUNICATIONMEDIA_CLASSIFIER_CAPACITY,
                MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_SPEEDFACTOR,
                MARTEDesignerTagTypes.PROCESSINGRESOURCE_CLASSIFIER_PROCESSINGRESOURCE_CLASSIFIER_MAINSCHEDULER
        };
        
        /*
         * the tag type descriptions List<MObject> has to be created here also.
         */
        String[] listDescriptions = new String[] {
                "Indicates the multiplicity of a resource. For a classifier it may specifiy the maximum of instances of\n" +
                "the resource considered as available. By default only one instance is available.",
        
                "It true it indicates that the access to the resource is protected by some kind of brokeringResource.",     
        
                "It true it indicates that the resource has an initial behavior associated that allows it possibly\n"+
                "perform its services autonomously or by the triggering and animation of behaviors on others.",
        
                "Characterizes the size of the elements to be transmitted." ,  
        
                "Defines the transmission mode, one the following values : simplex, half-simplex or full-duplex.",
        
                "Time the communicationMedia is blocked and cannot transmit due to the transmission of one\n" +
                "communication quantum.",
        
                "Time to transmit the element used as a communication quantum, usually called a packet, the size in\n"+
                "bits of this quantum is described by the attribute elementSize.",          
        
                "Capacity of the communication element when applicable link.",  
        
                "Is a relative factor for annotating the processing speed expressed as a ratio to the speed of the\n"+
                "reference processingResource for the system under consideration.",
        
                "Is the scheduler that controls the access to its processing capacity."
        };
        
        /*
         * the init function has to call in the CommunicationMedia_BodyTreePage constructor.
         */
        init(dialog, element, listTagTypes, listDescriptions);
        
        /*
         * the listener is created here.
         */
        new ListenerCommunicationMedia_BTP(dialog, this, this.element);
    }

    public String getElementSize() {
        return getDataSingleValueInteger(elementSize);
    }

    public String getResMult() {
        return getDataSingleValueInteger(resMult);
    }

    public boolean getIsProtected() {
        return getDataBoolean(isProtected);
    }

    public boolean getIsActive() {
        return getDataBoolean(isActive);
    }

    public String getTransmMode() {
        return getDataSingleElt(transmMode);
    }

    public String[] getBlockT() {
        return getDataComplex(complex_blockT.getListEditor());
    }

    public String[] getPacketT() {
        return getDataComplex(complex_packetT.getListEditor());
    }

    public String[] getCapacity() {
        return getDataComplex(complex_capacity.getListEditor());
    }

    public String getSpeedFactor() {
        return getDataSingleValue(speedFactor);
    }

    public String getMainScheduler() {
        return getDataSingleElt(mainScheduler);
    }

    public void buildTabFolder() {
        // elements getting
        isProtected  = setCompositeBoolean(getListTagTypes()[1], getListDescriptions()[1], 1);
        updateBoolean(isProtected, getListTagTypes()[1], this.element);
        
        isActive = setCompositeBoolean(getListTagTypes()[2], getListDescriptions()[2], 2); 
        updateBoolean(isActive, getListTagTypes()[2], this.element);
        
        
        elementSize = setCompositeSingleVal(getListTagTypes()[3], getListDescriptions()[3], 3);
        updateSingleValue(elementSize, getListTagTypes()[3], this.element);
         
        String[] transmModeKinds = new String[]{"simplex", "half-duplex", "full-duplex"};
        transmMode = setCompositeSingleKind(getListTagTypes()[4], getListDescriptions()[4], 4);
        updateSingleKind(transmMode, getListTagTypes()[4], element, transmModeKinds);
        
        complex_blockT = new ComplexTree_NFP_Duration(getListTagTypes()[5]);
        setCompositeComplex(getListTagTypes()[5], getListDescriptions()[5], 5, complex_blockT);
        complex_blockT.update(complex_blockT, getListTagTypes()[5], this.element);
        
        complex_packetT = new ComplexTree_NFP_Duration(getListTagTypes()[6]);
        setCompositeComplex(getListTagTypes()[6], getListDescriptions()[6], 6, complex_packetT);
        complex_packetT.update(complex_packetT, getListTagTypes()[6], this.element);
        
        complex_capacity = new ComplexTree_NFP_DataTxRate(getListTagTypes()[7]);
        setCompositeComplex(getListTagTypes()[7], getListDescriptions()[7], 7, complex_capacity);
        complex_capacity.update(complex_capacity, getListTagTypes()[7], this.element);
        
        speedFactor = setCompositeSingleVal(getListTagTypes()[8], getListDescriptions()[8], 8);
        updateSingleValue(speedFactor, getListTagTypes()[8], this.element);
        
        mainScheduler = setCompositeSingleElt(getListTagTypes()[9], getListDescriptions()[9], 9);
        updateSingleElement(mainScheduler, getListTagTypes()[9], element, ModelUtils.searchElement(Classifier.class, MARTEDesignerStereotypes.SCHEDULER_CLASSIFIER), MARTEDesignerStereotypes.PROFILEASSOCIATION_MAINSCHEDULER_PROCESSINGRESOURCE_SCHEDULER);
        
        resMult = setCompositeSingleVal(getListTagTypes()[0], getListDescriptions()[0], 0);
        updateSingleValue(resMult, getListTagTypes()[0], this.element);
    }

}
