/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwtiming.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.TimingResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwTimingResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("507d5411-edba-41cc-815d-8613f0da0d21")
public class HwTimingResourceClassifier extends TimingResourceClassifier {
    @objid ("60b73897-5841-40fe-9eba-6724fde3c367")
    public static final String STEREOTYPE_NAME = "HwTimingResource_Classifier";

    @objid ("eafbe345-007b-4811-9c89-0bc56ed55a6d")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwTimingResource_Classifier_description";

    @objid ("d76175de-f08d-4c2d-9e6e-0881c4a46f9d")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE = "HwTimingResource_Classifier_endPoints";

    @objid ("28ba5bd1-6331-46f7-81a9-0ee68388b6fe")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE = "HwTimingResource_Classifier_frequency";

    @objid ("0de8056d-2b3b-4489-ab6f-f0c79a576419")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE = "HwTimingResource_Classifier_ownedHW";

    @objid ("a5f2a738-2c4d-41cf-87fd-020d9672cbb9")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwTimingResource_Classifier_p_HW_Services";

    @objid ("0e24bbf5-03a2-4ded-b46d-0ba7c7318842")
    public static final String HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwTimingResource_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwTimingResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwTimingResource_Classifier >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0566477a-7079-4927-87d0-a4dba3d369e9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwTimingResource_Classifier >> then instantiate a {@link HwTimingResourceClassifier} proxy.
     * 
     * @return a {@link HwTimingResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("1968360f-65e6-4233-8c6a-719bbed7bcbb")
    public static HwTimingResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwTimingResourceClassifier.STEREOTYPE_NAME);
        return HwTimingResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceClassifier} proxy from a {@link Classifier} stereotyped << HwTimingResource_Classifier >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwTimingResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("8a09ab31-1c7a-4867-bd24-63e2fbddd8dd")
    public static HwTimingResourceClassifier instantiate(final Classifier obj) {
        return HwTimingResourceClassifier.canInstantiate(obj) ? new HwTimingResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwTimingResourceClassifier} proxy from a {@link Classifier} stereotyped << HwTimingResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwTimingResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("93fac747-1914-4739-aced-27d8ed86fde0")
    public static HwTimingResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwTimingResourceClassifier.canInstantiate(obj))
        	return new HwTimingResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("HwTimingResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("86b8e7e1-9f80-463a-bb32-5cb6cd89221e")
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
        HwTimingResourceClassifier other = (HwTimingResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("da36f782-6f40-4dbc-83c4-fcb06a7e819e")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwTimingResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("003a8743-0757-4f21-9ade-cbb6313e90c0")
    public String getHwTimingResource_Classifier_description() {
        return this.elt.getTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("bf0ca6d2-75da-400a-aca0-2cc1a5c274cc")
    public List<String> getHwTimingResource_Classifier_endPoints() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwTimingResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ec113424-65e2-4104-842c-30365147e052")
    public String getHwTimingResource_Classifier_frequency() {
        return this.elt.getTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("22aadbc2-03ab-401d-9a19-339fb705c09f")
    public List<String> getHwTimingResource_Classifier_ownedHW() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0324214d-a52a-4f94-b9ae-de4e90a34ef9")
    public List<String> getHwTimingResource_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwTimingResource_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("53e11f15-27e3-44b5-9b82-264ba394845d")
    public List<String> getHwTimingResource_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("146c7ebc-de32-484c-a6c4-10b8d2556482")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwTimingResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a13bef93-c97f-48b0-bb77-a3ec64c46bd4")
    public void setHwTimingResource_Classifier_description(final String value) {
        this.elt.putTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b470707d-0560-4f70-93ae-5c215a028971")
    public void setHwTimingResource_Classifier_endPoints(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwTimingResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("695fd7d1-420e-4ff9-9889-244fa573e415")
    public void setHwTimingResource_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("31f30145-58fb-4072-a562-274c4a841e98")
    public void setHwTimingResource_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6fc6cd27-d7a9-41b7-942d-7b73cf08a713")
    public void setHwTimingResource_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwTimingResource_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("fa315450-62cb-4860-97da-36526e3e34ff")
    public void setHwTimingResource_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwTimingResourceClassifier.MdaTypes.HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("2572871a-ea1c-43d4-9042-6a0dc3aa3b17")
    protected HwTimingResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("ce9eb92d-6782-47a0-ba87-9ba96dd315ae")
    public static final class MdaTypes {
        @objid ("6f571614-2f63-4933-8267-eafd6c72fd89")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2aa33c2b-4d51-4db2-86aa-51460740fbfa")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("37f338b4-2b60-4f0b-83b1-c83963c178ba")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("a9a4b0ba-b552-4c25-9ed9-452ed4b9cb8f")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("c3d57ad9-6bcd-4966-9213-4ab40a285fbe")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        @objid ("8525a8e9-7a0f-4844-b545-ea4f40251079")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("11e17450-3029-4717-9bac-961f8dbc96a9")
        public static TagType HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("0b6c12a7-23fb-491b-b6a9-9e86f6a5f2ea")
        private static Stereotype MDAASSOCDEP;

        @objid ("b8fded77-dd4b-4aac-8856-6e34daed7906")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("9c682abd-07a1-472f-8c26-93bce77593c7")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "8a99d40d-10ae-11df-81d9-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4277759b-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4277759c-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4277759d-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "4277759e-162a-11df-b9be-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bf113d9a-1709-11df-b92a-0014222a9f79");
            HWTIMINGRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "6c37a3f3-8dfb-11e0-8741-0027103f347c");
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
