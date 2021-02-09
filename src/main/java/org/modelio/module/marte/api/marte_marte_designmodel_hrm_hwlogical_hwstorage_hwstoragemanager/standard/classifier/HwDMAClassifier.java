/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.metamodel.uml.statik.Classifier;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier.HwArbiterClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwDMA_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwDMAClassifier extends HwArbiterClassifier {
    public static final String STEREOTYPE_NAME = "HwDMA_Classifier";

    public static final String HWDMA_CLASSIFIER_DRIVENBY_TAGTYPE = "HwDMA_Classifier_drivenBy";

    public static final String HWDMA_CLASSIFIER_ELEMENTSIZE_TAGTYPE = "HwDMA_Classifier_elementSize";

    public static final String HWDMA_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Classifier_managedMemories";

    public static final String HWDMA_CLASSIFIER_NBCHANNELS_TAGTYPE = "HwDMA_Classifier_nbChannels";

    public static final String HWDMA_CLASSIFIER_TRANSFERWIDTH_TAGTYPE = "HwDMA_Classifier_transferWidth";

    /**
     * Tells whether a {@link HwDMAClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwDMA_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwDMA_Classifier >> then instantiate a {@link HwDMAClassifier} proxy.
     * 
     * @return a {@link HwDMAClassifier} proxy on the created {@link Classifier}.
     */
    public static HwDMAClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAClassifier.STEREOTYPE_NAME);
        return HwDMAClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAClassifier} proxy from a {@link Classifier} stereotyped << HwDMA_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwDMAClassifier} proxy or <i>null</i>.
     */
    public static HwDMAClassifier instantiate(final Classifier obj) {
        return HwDMAClassifier.canInstantiate(obj) ? new HwDMAClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwDMAClassifier} proxy from a {@link Classifier} stereotyped << HwDMA_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwDMAClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwDMAClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwDMAClassifier.canInstantiate(obj))
        	return new HwDMAClassifier(obj);
        else
        	throw new IllegalArgumentException("HwDMAClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @Override
    public boolean equals(final Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        HwDMAClassifier other = (HwDMAClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Classifier_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Classifier_drivenBy() {
        return this.elt.getTagValues(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Classifier_elementSize() {
        return this.elt.getTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Classifier_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwDMA_Classifier_managedMemories() {
        return this.elt.getTagValues(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Classifier_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Classifier_nbChannels() {
        return this.elt.getTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Classifier_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwDMA_Classifier_transferWidth() {
        return this.elt.getTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Classifier_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Classifier_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Classifier_elementSize(final String value) {
        this.elt.putTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Classifier_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Classifier_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Classifier_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Classifier_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Classifier_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwDMA_Classifier_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    protected HwDMAClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWDMA_CLASSIFIER_NBCHANNELS_TAGTYPE_ELT;

        public static TagType HWDMA_CLASSIFIER_TRANSFERWIDTH_TAGTYPE_ELT;

        public static TagType HWDMA_CLASSIFIER_DRIVENBY_TAGTYPE_ELT;

        public static TagType HWDMA_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT;

        public static TagType HWDMA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8aeb1098-10b2-11df-81d9-0014222a9f79");
            HWDMA_CLASSIFIER_NBCHANNELS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8aeb109b-10b2-11df-81d9-0014222a9f79");
            HWDMA_CLASSIFIER_TRANSFERWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8aeb109a-10b2-11df-81d9-0014222a9f79");
            HWDMA_CLASSIFIER_DRIVENBY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "8aeb1099-10b2-11df-81d9-0014222a9f79");
            HWDMA_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "705796c8-162f-11df-b9be-0014222a9f79");
            HWDMA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9eb0c1fa-92a3-11e0-a69d-0027103f347c");
            MDAASSOCDEP = ctx.getModelingSession().findElementById(Stereotype.class, "94b7efa5-f94c-4d1d-896f-f103e56a8e2e");
            MDAASSOCDEP_ROLE = ctx.getModelingSession().findElementById(TagType.class, "7637f2fd-b750-43c1-a15c-5d0b084ca1cd");
        }


	static {
		if(MARTEModule.getInstance() != null) {
			init(MARTEModule.getInstance().getModuleContext());
		}
	}
    }

}
