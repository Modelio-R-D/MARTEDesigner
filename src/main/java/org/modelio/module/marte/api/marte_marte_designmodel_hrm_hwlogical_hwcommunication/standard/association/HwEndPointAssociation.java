/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.association;

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
import org.modelio.metamodel.uml.statik.Association;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.association.CommunicationEndPointAssociation;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Association} with << HwEndPoint_Association >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9a0b8c8b-4af1-40a2-a8b3-b926cafed60c")
public class HwEndPointAssociation extends CommunicationEndPointAssociation {
    @objid ("ca4fc507-dc10-467c-9ba9-786e202fbc03")
    public static final String STEREOTYPE_NAME = "HwEndPoint_Association";

    @objid ("7dfc6e92-b5e2-44b3-81a1-dfe741156efd")
    public static final String HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE = "HwEndPoint_Association_connectedTo";

    @objid ("4701c4a6-5b73-47a3-a460-2b6858ebe55c")
    public static final String HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE = "HwEndPoint_Association_description";

    @objid ("314ade08-019d-4feb-9a3d-5093763d49d3")
    public static final String HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE = "HwEndPoint_Association_frequency";

    @objid ("44f385fd-5a3f-44b0-92db-bf0c433f5d91")
    public static final String HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE = "HwEndPoint_Association_ownedHW";

    @objid ("e404dcc6-f8e9-4254-8582-2d128a142ea3")
    public static final String HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE = "HwEndPoint_Association_p_HW_Services";

    @objid ("8e410a6a-95a7-45a3-8860-fac9cdf0e57e")
    public static final String HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE = "HwEndPoint_Association_r_HW_Services";

    /**
     * Tells whether a {@link HwEndPointAssociation proxy} can be instantiated from a {@link MObject} checking it is a {@link Association} stereotyped << HwEndPoint_Association >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b3837419-68a1-4d23-84e2-34b14cdd374b")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Association) && ((Association) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Association} stereotyped << HwEndPoint_Association >> then instantiate a {@link HwEndPointAssociation} proxy.
     * 
     * @return a {@link HwEndPointAssociation} proxy on the created {@link Association}.
     */
    @objid ("32fdc9d2-6e6c-4b6e-a92f-01433e2682e5")
    public static HwEndPointAssociation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Association");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwEndPointAssociation.STEREOTYPE_NAME);
        return HwEndPointAssociation.instantiate((Association)e);
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociation} proxy from a {@link Association} stereotyped << HwEndPoint_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Association
     * @return a {@link HwEndPointAssociation} proxy or <i>null</i>.
     */
    @objid ("dc8eabb5-ed98-43bb-bc34-5eb7c23e1381")
    public static HwEndPointAssociation instantiate(final Association obj) {
        return HwEndPointAssociation.canInstantiate(obj) ? new HwEndPointAssociation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwEndPointAssociation} proxy from a {@link Association} stereotyped << HwEndPoint_Association >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Association}
     * @return a {@link HwEndPointAssociation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("821a62a0-5406-40db-984f-8af46202a3d7")
    public static HwEndPointAssociation safeInstantiate(final Association obj) throws IllegalArgumentException {
        if (HwEndPointAssociation.canInstantiate(obj))
        	return new HwEndPointAssociation(obj);
        else
        	throw new IllegalArgumentException("HwEndPointAssociation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("38c14af2-cd24-4ec9-a586-710b8e17ce05")
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
        HwEndPointAssociation other = (HwEndPointAssociation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Association}. 
     * @return the Association represented by this proxy, never null.
     */
    @objid ("150128b4-f7dd-41a3-8785-e185479e03b0")
    @Override
    public Association getElement() {
        return (Association)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_connectedTo'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("686d2c32-08ff-4ac5-be2a-95fbb0c6510c")
    public List<String> getHwEndPoint_Association_connectedTo() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("959c4e7d-bc4f-4391-9068-90b95e1246c3")
    public String getHwEndPoint_Association_description() {
        return this.elt.getTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwEndPoint_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("af14378e-507d-47cf-bb22-03ccefc31b52")
    public String getHwEndPoint_Association_frequency() {
        return this.elt.getTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("b6c8f6c0-672f-4ec9-a2ea-8657d7cf7e48")
    public List<String> getHwEndPoint_Association_ownedHW() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9a5fe3a2-d4d9-469c-ad85-ae9b576d8cfa")
    public List<String> getHwEndPoint_Association_p_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwEndPoint_Association_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("9db76b12-3141-4f9d-bce9-8e77fd7b1acc")
    public List<String> getHwEndPoint_Association_r_HW_Services() {
        return this.elt.getTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("e86b5538-4ebb-43e7-9c7e-b964baa2cf04")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_connectedTo'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bb50a608-9afd-487d-a12e-fce7d08291e4")
    public void setHwEndPoint_Association_connectedTo(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwEndPoint_Association_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d11298ba-2ef4-4cfe-92ff-2fccb609330f")
    public void setHwEndPoint_Association_description(final String value) {
        this.elt.putTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'HwEndPoint_Association_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("93ffc7f5-bd7e-4f9f-a4f6-f35a2e67958d")
    public void setHwEndPoint_Association_frequency(final String value) {
        this.elt.putTagValue(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("970ec5df-1aca-4afe-8dd5-f0624a3eca26")
    public void setHwEndPoint_Association_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b2b8686-1663-4868-a077-c0e580f58b10")
    public void setHwEndPoint_Association_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwEndPoint_Association_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f3cc6a67-3c4f-44dc-a138-8c69d1c7c997")
    public void setHwEndPoint_Association_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwEndPointAssociation.MdaTypes.HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("d4f6af6f-3de2-41ca-a938-e40f9efa8b9e")
    protected HwEndPointAssociation(final Association elt) {
        super(elt);
    }

    @objid ("702ee6c3-3ed2-4b7e-bbb9-5af441477f3d")
    public static final class MdaTypes {
        @objid ("38110d7d-09a5-4c81-83c7-d489dacb7655")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("e5604d0b-fe85-4151-9872-0a66d8cd497d")
        public static TagType HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT;

        @objid ("7f4013bf-5d09-4344-9eac-fe52f2278129")
        public static TagType HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT;

        @objid ("4d4277c6-fb92-434d-9aec-1cee7137aa69")
        public static TagType HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("2fb9e593-bcee-451c-bc2d-f96358caec2d")
        public static TagType HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("0aaec6e5-f911-4f2d-a36a-a4ba6d56bb69")
        public static TagType HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT;

        @objid ("1a5db777-b2d3-41d8-9e2d-69e6b634eb1c")
        public static TagType HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT;

        @objid ("2dc4878d-ca1b-4565-a6d3-b84e9c4b6c08")
        private static Stereotype MDAASSOCDEP;

        @objid ("d8d54089-ca72-4c3a-9262-4037deabd223")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("28caa583-7835-4b39-8663-a49fc3f1656c")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "3cdf782a-10ac-11df-81d9-0014222a9f79");
            HWENDPOINT_ASSOCIATION_CONNECTEDTO_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "e64926e0-1726-11df-b92a-0014222a9f79");
            HWENDPOINT_ASSOCIATION_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be1-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be2-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be3-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be4-92a9-11e0-a69d-0027103f347c");
            HWENDPOINT_ASSOCIATION_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "48c24be5-92a9-11e0-a69d-0027103f347c");
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
