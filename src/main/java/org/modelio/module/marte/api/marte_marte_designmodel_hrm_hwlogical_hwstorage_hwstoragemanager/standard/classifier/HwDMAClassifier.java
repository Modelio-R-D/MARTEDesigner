/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwstorage_hwstoragemanager.standard.classifier;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
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
@objid ("9acbb2b3-ef8d-4158-9656-91e50174c89a")
public class HwDMAClassifier extends HwArbiterClassifier {
    @objid ("df517783-0702-4463-9bef-d9fb00ebb71e")
    public static final String STEREOTYPE_NAME = "HwDMA_Classifier";

    @objid ("ac214109-8474-451f-b477-aa708ce4c86d")
    public static final String HWDMA_CLASSIFIER_DRIVENBY_TAGTYPE = "HwDMA_Classifier_drivenBy";

    @objid ("2c92d283-e628-45a4-b147-7583da1bcdbb")
    public static final String HWDMA_CLASSIFIER_ELEMENTSIZE_TAGTYPE = "HwDMA_Classifier_elementSize";

    @objid ("2514275b-5a63-4fc8-8ea2-e640ae263bed")
    public static final String HWDMA_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE = "HwDMA_Classifier_managedMemories";

    @objid ("4f8e1def-67aa-42ab-b0e2-d375a4fb0486")
    public static final String HWDMA_CLASSIFIER_NBCHANNELS_TAGTYPE = "HwDMA_Classifier_nbChannels";

    @objid ("0ea59120-669c-409c-867c-0f9e655ab7ca")
    public static final String HWDMA_CLASSIFIER_TRANSFERWIDTH_TAGTYPE = "HwDMA_Classifier_transferWidth";

    /**
     * Tells whether a {@link HwDMAClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwDMA_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("cbce7e1b-c851-4adf-923d-130df7aef5f9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwDMA_Classifier >> then instantiate a {@link HwDMAClassifier} proxy.
     * 
     * @return a {@link HwDMAClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("72f2f81b-7dfc-450a-bd8a-834f0dfc2baf")
    public static HwDMAClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwDMAClassifier.STEREOTYPE_NAME);
        return HwDMAClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwDMAClassifier} proxy from a {@link Classifier} stereotyped << HwDMA_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwDMAClassifier} proxy or <i>null</i>.
     */
    @objid ("1cf0b9ba-5f01-4a9b-acad-89ce67212b31")
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
    @objid ("cee5f025-5591-4f46-8557-25154fd12122")
    public static HwDMAClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwDMAClassifier.canInstantiate(obj))
        	return new HwDMAClassifier(obj);
        else
        	throw new IllegalArgumentException("HwDMAClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("2b798480-29cd-4b95-ab3b-0fbefce944d4")
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
    @objid ("8dc0109c-3fd8-471a-b476-b79e4bc7130b")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwDMA_Classifier_drivenBy'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("d4afa46d-680d-434f-8800-799c75ba7cc2")
    public List<String> getHwDMA_Classifier_drivenBy() {
        return this.elt.getTagValues(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_DRIVENBY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("beae0fff-1955-4dba-8327-1c11920a1a5c")
    public String getHwDMA_Classifier_elementSize() {
        return this.elt.getTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwDMA_Classifier_managedMemories'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("75501d29-5330-422a-bdee-a3742bef4cec")
    public List<String> getHwDMA_Classifier_managedMemories() {
        return this.elt.getTagValues(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Classifier_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7437acc6-4645-45ef-96c3-0aeb61a90a95")
    public String getHwDMA_Classifier_nbChannels() {
        return this.elt.getTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_NBCHANNELS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwDMA_Classifier_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b099f3f0-a710-4f4e-bc9c-592afa55c2f4")
    public String getHwDMA_Classifier_transferWidth() {
        return this.elt.getTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_TRANSFERWIDTH_TAGTYPE_ELT);
    }

    @objid ("85b1de79-df2a-4a9f-9f55-284ece28f433")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwDMA_Classifier_drivenBy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f88cd55d-82d7-4492-96c5-ff971e543f54")
    public void setHwDMA_Classifier_drivenBy(final List<String> values) {
        this.elt.putTagValues(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_DRIVENBY_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Classifier_elementSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fce93527-b799-443e-9993-059dbd12ff70")
    public void setHwDMA_Classifier_elementSize(final String value) {
        this.elt.putTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwDMA_Classifier_managedMemories'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6f177212-9373-478b-abc3-ec208994f3b0")
    public void setHwDMA_Classifier_managedMemories(final List<String> values) {
        this.elt.putTagValues(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwDMA_Classifier_nbChannels'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f6d81c91-24a5-4216-8d32-c2c1094e31ac")
    public void setHwDMA_Classifier_nbChannels(final String value) {
        this.elt.putTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_NBCHANNELS_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwDMA_Classifier_transferWidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("418ef7a2-da48-47b3-a025-693b22bb8afc")
    public void setHwDMA_Classifier_transferWidth(final String value) {
        this.elt.putTagValue(HwDMAClassifier.MdaTypes.HWDMA_CLASSIFIER_TRANSFERWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("6e5a39d6-f550-43b1-aef6-c9d2914a88b8")
    protected HwDMAClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("3cc56441-11da-44f4-a2d9-3f430382172a")
    public static final class MdaTypes {
        @objid ("9ec65d3d-db7e-40e7-8e52-6e3da38bd934")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3987605d-b7d9-4ef7-9c68-34e63c77ece7")
        public static TagType HWDMA_CLASSIFIER_NBCHANNELS_TAGTYPE_ELT;

        @objid ("8421beb8-e087-424b-9fa6-f429494f6c2a")
        public static TagType HWDMA_CLASSIFIER_TRANSFERWIDTH_TAGTYPE_ELT;

        @objid ("ffdd34c2-7633-4f14-9c4d-e99d38fdf0cf")
        public static TagType HWDMA_CLASSIFIER_DRIVENBY_TAGTYPE_ELT;

        @objid ("310323ba-631a-4365-97b4-37c7268071a0")
        public static TagType HWDMA_CLASSIFIER_MANAGEDMEMORIES_TAGTYPE_ELT;

        @objid ("941358e8-2735-47d0-a4ed-d63f882b35cf")
        public static TagType HWDMA_CLASSIFIER_ELEMENTSIZE_TAGTYPE_ELT;

        @objid ("b1a153e5-4e56-4b8e-8297-3fe342f44c43")
        private static Stereotype MDAASSOCDEP;

        @objid ("5489d31c-3b90-4590-b9b1-061dd59e1b68")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e71b5f40-5557-4cd6-8fd7-f2cef7275253")
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
