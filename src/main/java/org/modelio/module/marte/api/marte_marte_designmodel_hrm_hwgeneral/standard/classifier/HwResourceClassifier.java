/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.classifier;

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
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.classifier.ResourceClassifier;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Classifier} with << HwResource_Classifier >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("630b0429-bc50-4701-90fa-0d67ec455cd0")
public class HwResourceClassifier extends ResourceClassifier {
    @objid ("97b839f9-2a12-4133-aeaa-fc2bbb7588f7")
    public static final String STEREOTYPE_NAME = "HwResource_Classifier";

    @objid ("7460880f-22cf-4a40-8563-784680421b95")
    public static final String HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE = "HwResource_Classifier_description";

    @objid ("4bcf28f3-ae2b-4400-9a8e-c2ff5e2a8025")
    public static final String HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE = "HwResource_Classifier_endPoints";

    @objid ("b38d5bde-7b2d-40a3-a49e-672ad97801a1")
    public static final String HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE = "HwResource_Classifier_frequency";

    @objid ("7027c996-28b8-4c5e-9643-fb3bba3f42e8")
    public static final String HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE = "HwResource_Classifier_ownedHW";

    @objid ("529e380e-64af-4a95-9197-5d4690416aa6")
    public static final String HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE = "HwResource_Classifier_p_HW_Services";

    @objid ("0dcccfa4-49f1-4707-b3ec-dbf8e97f2290")
    public static final String HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE = "HwResource_Classifier_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceClassifier proxy} can be instantiated from a {@link MObject} checking it is a {@link Classifier} stereotyped << HwResource_Classifier >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("178fe095-032c-42de-833e-6c63e6783ad2")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Classifier) && ((Classifier) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceClassifier.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Classifier} stereotyped << HwResource_Classifier >> then instantiate a {@link HwResourceClassifier} proxy.
     * 
     * @return a {@link HwResourceClassifier} proxy on the created {@link Classifier}.
     */
    @objid ("7e4408ae-573a-4285-843b-ae2fc31b8c79")
    public static HwResourceClassifier create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Classifier");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceClassifier.STEREOTYPE_NAME);
        return HwResourceClassifier.instantiate((Classifier)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceClassifier} proxy from a {@link Classifier} stereotyped << HwResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Classifier
     * @return a {@link HwResourceClassifier} proxy or <i>null</i>.
     */
    @objid ("e0ec3f97-5e94-4638-8a14-a817ef4c1f34")
    public static HwResourceClassifier instantiate(final Classifier obj) {
        return HwResourceClassifier.canInstantiate(obj) ? new HwResourceClassifier(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceClassifier} proxy from a {@link Classifier} stereotyped << HwResource_Classifier >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Classifier}
     * @return a {@link HwResourceClassifier} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b21b79b7-82f6-482c-9a25-90a85fc59fd6")
    public static HwResourceClassifier safeInstantiate(final Classifier obj) throws IllegalArgumentException {
        if (HwResourceClassifier.canInstantiate(obj))
        	return new HwResourceClassifier(obj);
        else
        	throw new IllegalArgumentException("HwResourceClassifier: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("8d2deb7a-304e-47f8-b7da-651a18882271")
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
        HwResourceClassifier other = (HwResourceClassifier) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Classifier}. 
     * @return the Classifier represented by this proxy, never null.
     */
    @objid ("139eff09-2e94-43f9-b2b7-56172fc6d393")
    @Override
    public Classifier getElement() {
        return (Classifier)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2c38bfbf-7f87-4227-a07d-49119e59fcd7")
    public String getHwResource_Classifier_description() {
        return this.elt.getTagValue(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Classifier_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("186c7fd0-dec2-4b44-b3ed-c7f6f8103c1f")
    public List<String> getHwResource_Classifier_endPoints() {
        return this.elt.getTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9374add0-8921-489a-8cc0-189da43ca8fa")
    public String getHwResource_Classifier_frequency() {
        return this.elt.getTagValue(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Classifier_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("c796da83-64e8-4fa6-9c9b-5ccd8563fe52")
    public List<String> getHwResource_Classifier_ownedHW() {
        return this.elt.getTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Classifier_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("11d2cb5d-1edc-4ea3-8c93-65927dd97d3e")
    public List<String> getHwResource_Classifier_p_HW_Services() {
        return this.elt.getTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Classifier_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("62add501-92be-4a5c-8991-9d0fe275784f")
    public List<String> getHwResource_Classifier_r_HW_Services() {
        return this.elt.getTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("b64f91ae-3870-412b-8cdb-af79a96bcf24")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Classifier_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("084a30cd-4024-4bee-b5e6-b94cb6d48c06")
    public void setHwResource_Classifier_description(final String value) {
        this.elt.putTagValue(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Classifier_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2521ea36-8f6d-420f-8982-bd94e22a2a5c")
    public void setHwResource_Classifier_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Classifier_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("68c948ed-fe8e-49d5-b0e2-31b200c743bc")
    public void setHwResource_Classifier_frequency(final String value) {
        this.elt.putTagValue(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Classifier_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("de50ab51-2db1-4fb7-a233-ffcaaeba33da")
    public void setHwResource_Classifier_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Classifier_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("ed386e86-a71f-44b9-b8d5-d25c985eb3ab")
    public void setHwResource_Classifier_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Classifier_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8d9e31b1-2a7d-4e27-a13c-9c6e3b17b65f")
    public void setHwResource_Classifier_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceClassifier.MdaTypes.HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("02d5dfe4-63ae-4c9b-baf5-5a74c14dfce6")
    protected HwResourceClassifier(final Classifier elt) {
        super(elt);
    }

    @objid ("3a568f6c-ca6a-4cd2-9c90-c1adc0afe05a")
    public static final class MdaTypes {
        @objid ("3bf85dce-c287-45e5-85e5-19b57799be1a")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("b2986f0c-e426-4fd2-98ea-919f7d34762c")
        public static TagType HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("faece743-f32b-4906-a5cc-63fdead17892")
        public static TagType HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("1b281958-22ab-4030-a358-ccf682797481")
        public static TagType HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("dd3dd40b-2991-4ed4-be76-966b131262ff")
        public static TagType HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT;

        @objid ("cec7b9b5-31e8-437d-8bf1-bc493df544ba")
        public static TagType HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT;

        @objid ("dd9b852d-4f1f-4e8e-9315-05dcc53ec4c9")
        public static TagType HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT;

        @objid ("6b11cc04-62d0-455c-98a5-c5a661481831")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad6ecc18-a96b-4590-befc-e3c791a00eba")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("8591f66d-5163-4a5b-95a4-23dfc1422c7a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "5b789d55-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283b2-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283b3-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283b4-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283af-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "735283b1-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_CLASSIFIER_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "329925ed-1709-11df-b92a-0014222a9f79");
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
