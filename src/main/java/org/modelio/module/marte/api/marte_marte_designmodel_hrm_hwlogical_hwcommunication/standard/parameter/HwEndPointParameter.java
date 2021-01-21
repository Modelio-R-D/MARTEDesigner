/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter;

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
import org.modelio.metamodel.uml.statik.Parameter;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter.CommunicationEndPointParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwEndPoint_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ce5f3c94-3963-4d6c-a04f-48605b42a1c5")
public class HwEndPointParameter extends CommunicationEndPointParameter {
    @objid ("45917d99-53fd-40e3-becd-e7f60365b34a")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Parameter";

    @objid ("1e0ffb68-f072-4d19-8c53-a1b477a52d64")
    public static final String HWENDPOINT_PARAMETER_CONNECTEDTO_TAGTYPE = "HwEndPoint_Parameter_connectedTo";

    @objid ("2de147dc-b63c-431a-93e2-7ca69e6e3c08")
    public static final String HWENDPOINT_PARAMETER_DESCRIPTION_TAGTYPE = "HwEndPoint_Parameter_description";

    @objid ("e523c4a7-f4e5-47d4-8d26-7d0ee1bb95ff")
    public static final String HWENDPOINT_PARAMETER_FREQUENCY_TAGTYPE = "HwEndPoint_Parameter_frequency";

    @objid ("0b02328f-f49b-44fa-ab08-d6a581ffd743")
    public static final String HWENDPOINT_PARAMETER_OWNEDHW_TAGTYPE = "HwEndPoint_Parameter_ownedHW";

    @objid ("61f5e63a-bf27-458d-b91e-1837e77c993d")
    public static final String HWENDPOINT_PARAMETER_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Parameter_p_HW_Services";

    @objid ("487a63e6-a1b7-48da-b19b-51f830560d95")
    public static final String HWENDPOINT_PARAMETER_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Parameter_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwEndPoint_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("979d645f-6285-49f3-8048-1e7c2a2e2e03")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwEndPoint_Parameter >> then instantiate a {@link HwEndPointParameter} proxy.
     * 
     * @return a {@link HwEndPointParameter} proxy on the created {@link Parameter}.
     */
    @objid ("9ac2bc67-2b56-4ac8-bbeb-267ee53c6232")
    public static HwEndPointParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointParameter.STEREOTYPE_NAME);
        return HwEndPointParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointParameter} proxy from a {@link Parameter} stereotyped << HwEndPoint_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwEndPointParameter} proxy or <i>null</i>.
     */
    @objid ("46995083-b5ae-4ef2-9777-9b3d6bfec911")
    public static HwEndPointParameter instantiate(final Parameter obj) {
        return HwEndPointParameter.canInstantiate(obj) ? new HwEndPointParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointParameter} proxy from a {@link Parameter} stereotyped << HwEndPoint_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwEndPointParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("4d5264b0-e9cd-45c6-9f58-c1f7071b7d41")
    public static HwEndPointParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwEndPointParameter.canInstantiate(obj))
        	return new HwEndPointParameter(obj);
        else
        	throw new IllegalArgumentException("HwEndPointParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6d962273-fe00-4fcc-9ffb-5ee94ae091f9")
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
        HwEndPointParameter other = (HwEndPointParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("562515c0-b38a-46af-884d-93445fb1e79f")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Parameter_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("0ec23249-f691-4b45-b625-7ad9d754ceec")
    public List<String> getHwEndPoint_Parameter_connectedTo() {
        return this.elt.getTagValues(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f9a1262a-1ffc-4bb1-82a7-044f48bceaad")
    public String getHwEndPoint_Parameter_description() {
        return this.elt.getTagValue(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e5fcb0e-ce2e-4c59-b15e-19d3ff498419")
    public String getHwEndPoint_Parameter_frequency() {
        return this.elt.getTagValue(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Parameter_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("3b59908d-4cc4-4aab-a600-a59487ded3b1")
    public List<String> getHwEndPoint_Parameter_ownedHW() {
        return this.elt.getTagValues(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Parameter_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8b6cd790-4a6f-46e2-8953-840d6b06bc51")
    public List<String> getHwEndPoint_Parameter_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Parameter_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cea671be-a5c9-4cf3-a8b2-d332c53ecf0b")
    public List<String> getHwEndPoint_Parameter_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("19940361-17ad-473d-a2bd-8a709e242ac1")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Parameter_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d6eb91bb-44a3-436d-bf34-234a29a83ce0")
    public void setHwEndPoint_Parameter_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Parameter_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5faf1340-19e2-4f68-93e4-3008031a056b")
    public void setHwEndPoint_Parameter_description(final String value) {
        this.elt.putTagValue(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Parameter_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0baf2488-5c2d-4d4b-b595-e60b80f1f090")
    public void setHwEndPoint_Parameter_frequency(final String value) {
        this.elt.putTagValue(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Parameter_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("118d814c-476c-4f94-ade7-c191c21e15f2")
    public void setHwEndPoint_Parameter_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Parameter_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7807e91a-73bc-437e-aa94-33fed73429c4")
    public void setHwEndPoint_Parameter_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Parameter_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("76eb5deb-7304-4b27-89dd-6d0c47f3dd4f")
    public void setHwEndPoint_Parameter_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointParameter.MdaTypes.HWENDPOINT_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("0a0aab0a-6b77-45d8-bc88-d319fcd3cd68")
    protected HwEndPointParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("ba73eea2-7063-4c2e-a671-9b97f71370d3")
    public static final class MdaTypes {
        @objid ("8cdc142e-d818-4a8d-85fd-84785a372c12")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a19d1597-ec51-4b3c-ba2e-c77e72bfa005")
        public static TagType HWENDPOINT_PARAMETER_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("d34c45bd-2ccd-48d9-b5f6-865b011ba6ac")
        public static TagType HWENDPOINT_PARAMETER_DESCRIPTION_TAGTYPE_ELT;

        @objid ("2e59087e-e171-4869-924c-1cb0c6c8dffa")
        public static TagType HWENDPOINT_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("4a67509d-ac16-415f-968e-ecbb60c92729")
        public static TagType HWENDPOINT_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("5dca659e-05cb-4d65-a604-f41c3c5a952f")
        public static TagType HWENDPOINT_PARAMETER_OWNEDHW_TAGTYPE_ELT;

        @objid ("2c2b3ab4-cba2-4e3d-baf1-e23e546cc74d")
        public static TagType HWENDPOINT_PARAMETER_FREQUENCY_TAGTYPE_ELT;

        @objid ("e40684ff-e598-4718-bf25-a2752057499a")
        private static Stereotype MDAASSOCDEP;

        @objid ("9e20b3a3-e83d-4f72-8b7b-bacbe595ecc6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("6a16ac8e-56f5-4920-b95e-accea4d2037f")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "010a91ea-0ccf-11df-8525-001302895b2b");
            HWENDPOINT_PARAMETER_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "eacd7d47-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_PARAMETER_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "504ae51f-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_PARAMETER_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "504ae520-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_PARAMETER_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "504ae521-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_PARAMETER_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "504ae522-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_PARAMETER_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "504b0c30-92a9-11e0-a69d-0027103f347c");
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
