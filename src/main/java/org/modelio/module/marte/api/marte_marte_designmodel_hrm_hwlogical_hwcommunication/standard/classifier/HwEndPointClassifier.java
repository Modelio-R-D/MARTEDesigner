/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.CommunicationEndPointClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwEndPoint_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class HwEndPointClassifier extends CommunicationEndPointClassifier {
    public static final String STEREOTYPE_NAME = "HwEndPoint_Classifier";

    public static final String HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE = "HwEndPoint_Classifier_connectedTo";

    public static final String HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwEndPoint_Classifier_description";

    public static final String HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE = "HwEndPoint_Classifier_frequency";

    public static final String HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE = "HwEndPoint_Classifier_ownedHW";

    public static final String HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Classifier_p_HW_Services";

    public static final String HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwEndPoint_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwEndPoint_Classifier >> then instantiate a {@link HwEndPointClassifier} proxy.
     * 
     * @return a {@link HwEndPointClassifier} proxy on the created {@link Classifier}.
     */
    public static HwEndPointClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointClassifier.STEREOTYPE_NAME);
        return HwEndPointClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointClassifier} proxy from a {@link Classifier} stereotyped << HwEndPoint_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwEndPointClassifier} proxy or <i>null</i>.
     */
    public static HwEndPointClassifier instantiate(final Classifier obj) {
        return HwEndPointClassifier.canInstantiate(obj) ? new HwEndPointClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointClassifier} proxy from a {@link Classifier} stereotyped << HwEndPoint_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwEndPointClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static HwEndPointClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwEndPointClassifier.canInstantiate(obj))
        	return new HwEndPointClassifier(obj);
        else
        	throw new IllegalArgumentException("HwEndPointClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        HwEndPointClassifier other = (HwEndPointClassifier) obj;
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
     * Getter for List<String> property 'HwEndPoint_Classifier_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Classifier_connectedTo() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwEndPoint_Classifier_description() {
        return this.elt.getTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getHwEndPoint_Classifier_frequency() {
        return this.elt.getTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Classifier_ownedHW() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    public List<String> getHwEndPoint_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Classifier_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Classifier_description(final String value) {
        this.elt.putTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setHwEndPoint_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointClassifier.MdaTypes.HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    protected HwEndPointClassifier(final Classifier elt) {
        super(elt);
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT;

        public static TagType HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        public static TagType HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        public static TagType HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        public static TagType HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b35a9ebf-155d-11df-947b-001302895b2b");
            HWENDPOINT_CLASSIFIER_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e5264782-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baa8abe-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baa8abf-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baa8ac0-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baab1cf-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4baab1d0-92a9-11e0-a69d-0027103f347c");
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
