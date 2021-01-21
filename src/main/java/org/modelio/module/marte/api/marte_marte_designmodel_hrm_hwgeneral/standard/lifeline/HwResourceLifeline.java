/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
import org.modelio.metamodel.uml.infrastructure.Dependency;
import org.modelio.metamodel.uml.infrastructure.ModelElement;
import org.modelio.metamodel.uml.infrastructure.Stereotype;
import org.modelio.metamodel.uml.infrastructure.TagType;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyDefinition;
import org.modelio.metamodel.uml.infrastructure.properties.PropertyTableDefinition;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline.ResourceLifeline;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Lifeline} with << HwResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("5a115100-5941-4fb3-9628-6c33200f94da")
public class HwResourceLifeline extends ResourceLifeline {
    @objid ("30cdfebf-a02c-4149-a249-4dc195b203cb")
    public static final String STEREOTYPE_NAME = "HwResource_Lifeline";

    @objid ("9decf1bf-2490-4476-8a75-42fcfda1510c")
    public static final String HWRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE = "HwResource_Lifeline_description";

    @objid ("e71542a5-d034-47b7-9c74-fce9acbb6590")
    public static final String HWRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE = "HwResource_Lifeline_endPoints";

    @objid ("dc4bb76a-8217-411a-a36e-32d71c6dd79c")
    public static final String HWRESOURCE_LIFELINE_FREQUENCY_TAGTYPE = "HwResource_Lifeline_frequency";

    @objid ("a381be51-2a55-41f3-bc51-b1fd0bf06731")
    public static final String HWRESOURCE_LIFELINE_OWNEDHW_TAGTYPE = "HwResource_Lifeline_ownedHW";

    @objid ("4134cf73-74a5-4a60-bbd6-7754365a43aa")
    public static final String HWRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE = "HwResource_Lifeline_p_HW_Services";

    @objid ("2bf6bf46-0ca1-4c4b-bb47-c822a944aa69")
    public static final String HWRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE = "HwResource_Lifeline_r_HW_Services";

    /**
     * Tells whether a {@link HwResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << HwResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("e3ebf761-2f1d-48d3-9bb9-ad3499d9eafa")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << HwResource_Lifeline >> then instantiate a {@link HwResourceLifeline} proxy.
     * 
     * @return a {@link HwResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("041a9be9-3a23-425d-8f60-507b91cddb59")
    public static HwResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwResourceLifeline.STEREOTYPE_NAME);
        return HwResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link HwResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link HwResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("029de859-5bb9-4815-9e34-5115ce4c328f")
    public static HwResourceLifeline instantiate(final Lifeline obj) {
        return HwResourceLifeline.canInstantiate(obj) ? new HwResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwResourceLifeline} proxy from a {@link Lifeline} stereotyped << HwResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link HwResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("a1e84b30-fe52-4b5a-b71a-d0210e9be77e")
    public static HwResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (HwResourceLifeline.canInstantiate(obj))
        	return new HwResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("HwResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fefdf7b6-447c-4fbd-97a0-4f86b18d3aad")
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
        HwResourceLifeline other = (HwResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("ed34770f-73ae-4d96-81c8-01c490d81d56")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'HwResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("90d26389-a41b-4774-8d02-ed36ac7d6524")
    public String getHwResource_Lifeline_description() {
        return this.elt.getTagValue(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Lifeline_endPoints'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("35b76c5c-7cd2-4daf-8bd0-990487830612")
    public List<String> getHwResource_Lifeline_endPoints() {
        return this.elt.getTagValues(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d273bc74-709a-4a77-b701-e528b5da8e1d")
    public String getHwResource_Lifeline_frequency() {
        return this.elt.getTagValue(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Lifeline_ownedHW'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("8a1b5374-8321-4646-a5dd-74148ddc0bfc")
    public List<String> getHwResource_Lifeline_ownedHW() {
        return this.elt.getTagValues(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Lifeline_p_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6a1fa097-609d-452b-ac63-34e02250c9df")
    public List<String> getHwResource_Lifeline_p_HW_Services() {
        return this.elt.getTagValues(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'HwResource_Lifeline_r_HW_Services'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("6ced3a24-20a0-4c23-87e8-5d52bdf0ddfb")
    public List<String> getHwResource_Lifeline_r_HW_Services() {
        return this.elt.getTagValues(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT);
    }

    @objid ("196cfd29-fb09-49ce-8f00-737190dbdb9c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'HwResource_Lifeline_description'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("959dbfab-97ca-4a76-9926-c15b6686260d")
    public void setHwResource_Lifeline_description(final String value) {
        this.elt.putTagValue(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Lifeline_endPoints'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f8e85442-86e1-4ea7-a5d0-9d09bf8d8f6d")
    public void setHwResource_Lifeline_endPoints(final List<String> values) {
        this.elt.putTagValues(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwResource_Lifeline_frequency'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7bbf6371-2814-42e9-97a3-a015e48fd609")
    public void setHwResource_Lifeline_frequency(final String value) {
        this.elt.putTagValue(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'HwResource_Lifeline_ownedHW'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("09cc89ae-7e1a-46aa-94a4-ce58e5239b53")
    public void setHwResource_Lifeline_ownedHW(final List<String> values) {
        this.elt.putTagValues(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Lifeline_p_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2d1ebf1d-8081-4cc6-81d6-bb7d7018e385")
    public void setHwResource_Lifeline_p_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT, values);
    }

    /**
     * Setter for List<String> property 'HwResource_Lifeline_r_HW_Services'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b286920d-bfd6-41cf-86ce-5fff84d28fc9")
    public void setHwResource_Lifeline_r_HW_Services(final List<String> values) {
        this.elt.putTagValues(HwResourceLifeline.MdaTypes.HWRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT, values);
    }

    @objid ("53df958e-ead5-4062-9715-97c345acd29f")
    protected HwResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("405fd05f-919f-49dd-8d5a-ba1a33f0a216")
    public static final class MdaTypes {
        @objid ("fac90223-1c3c-4ec6-b02e-6e9693e231a0")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a929c2d0-a1b0-41fb-8024-19660d91f41b")
        public static TagType HWRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT;

        @objid ("cb6fef68-ffb3-4182-bedb-21f60991a832")
        public static TagType HWRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT;

        @objid ("09feb400-cdb5-4442-8dc0-f946686b01ad")
        public static TagType HWRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT;

        @objid ("2e8cedac-711b-43a9-b7a3-901c34774052")
        public static TagType HWRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT;

        @objid ("f1f47d31-c476-4262-84ff-c48a5ad2be75")
        public static TagType HWRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT;

        @objid ("ff052e24-2c8d-4f9e-ada0-d0a83bf5f659")
        public static TagType HWRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT;

        @objid ("e911588a-327b-49de-b433-170c9294b548")
        private static Stereotype MDAASSOCDEP;

        @objid ("4ed029dd-6bf1-4e96-accb-fdafb6c0d4ee")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("926313df-8c9c-43f0-b3aa-4c514976340d")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "528a2e2f-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_LIFELINE_DESCRIPTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7204ba7a-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_LIFELINE_P_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7204ba7b-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_LIFELINE_R_HW_SERVICES_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7204ba7c-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_LIFELINE_OWNEDHW_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7204ba77-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_LIFELINE_FREQUENCY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "7204ba79-1014-11df-86fe-0014222a9f79");
            HWRESOURCE_LIFELINE_ENDPOINTS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "2f56b459-1709-11df-b92a-0014222a9f79");
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
