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
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwMedia_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("dfa7716b-27b3-4618-a811-17de200c8757")
public class HwMediaParameter extends HwCommunicationResourceParameter {
    @objid ("d2e16885-4453-4b81-9e09-74a4c900fdfc")
    public static final String STEREOTYPE_NAME = "HwMedia_Parameter";

    @objid ("36ddb9ad-e6cf-4d8a-894d-11e8373087ef")
    public static final String HWMEDIA_PARAMETER_ARBITERS_TAGTYPE = "HwMedia_Parameter_arbiters";

    @objid ("be376267-be27-4819-9939-99d8728f7a18")
    public static final String HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE = "HwMedia_Parameter_bandwidth";

    /**
     * Tells whether a {@link HwMediaParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwMedia_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9703f1cc-4ed8-4048-9892-1de2f5d97364")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwMedia_Parameter >> then instantiate a {@link HwMediaParameter} proxy.
     * 
     * @return a {@link HwMediaParameter} proxy on the created {@link Parameter}.
     */
    @objid ("2a24dc73-812c-4d82-8cd5-ff3f0a4f0d25")
    public static HwMediaParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwMediaParameter.STEREOTYPE_NAME);
        return HwMediaParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwMediaParameter} proxy from a {@link Parameter} stereotyped << HwMedia_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwMediaParameter} proxy or <i>null</i>.
     */
    @objid ("1e71a5c0-b7b9-4145-adab-431e5bd49b7a")
    public static HwMediaParameter instantiate(final Parameter obj) {
        return HwMediaParameter.canInstantiate(obj) ? new HwMediaParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwMediaParameter} proxy from a {@link Parameter} stereotyped << HwMedia_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwMediaParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("0c3357fd-9a72-4afb-b9df-52b7efa798f4")
    public static HwMediaParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwMediaParameter.canInstantiate(obj))
        	return new HwMediaParameter(obj);
        else
        	throw new IllegalArgumentException("HwMediaParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("da52cc1e-981f-4ddd-8e6c-ecf356e59594")
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
        HwMediaParameter other = (HwMediaParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("2ad80819-88b1-4aed-8608-3d70e84a8fa7")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    /**
     * Getter for List<String> property 'HwMedia_Parameter_arbiters'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("aed8110d-8ab1-4c21-954f-31f3e275ab02")
    public List<String> getHwMedia_Parameter_arbiters() {
        return this.elt.getTagValues(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'HwMedia_Parameter_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c7a3f06-33fc-4e07-a052-27177719f9f8")
    public String getHwMedia_Parameter_bandwidth() {
        return this.elt.getTagValue(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT);
    }

    @objid ("5379ea53-9b6e-480c-89c6-ab70356a3af0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for List<String> property 'HwMedia_Parameter_arbiters'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2f5177a9-ea38-4971-aa8f-79f7dce348d2")
    public void setHwMedia_Parameter_arbiters(final List<String> values) {
        this.elt.putTagValues(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'HwMedia_Parameter_bandwidth'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0413406c-db3b-48e0-bd53-2b7f69b043d2")
    public void setHwMedia_Parameter_bandwidth(final String value) {
        this.elt.putTagValue(HwMediaParameter.MdaTypes.HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT, value);
    }

    @objid ("db60182b-5213-4f40-956d-bf6a5663f933")
    protected HwMediaParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("42289eba-1702-4574-a834-e043c9b594b6")
    public static final class MdaTypes {
        @objid ("037db2bb-6bfa-4098-8a23-f10eeb6c4ff7")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("18dbb232-c93f-4770-b7db-051d7bdaf126")
        public static TagType HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT;

        @objid ("1acdcd03-38af-463b-988c-48dd841095cd")
        public static TagType HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT;

        @objid ("c77dabfe-903c-410e-ba83-fff25b4d7113")
        private static Stereotype MDAASSOCDEP;

        @objid ("2a7c62de-3150-42e9-a1d0-5d62eba1797e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("02ff8da7-a561-45c1-921b-eb74afd8df6a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "01036af3-0ccf-11df-8525-001302895b2b");
            HWMEDIA_PARAMETER_ARBITERS_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0c99c146-1727-11df-b92a-0014222a9f79");
            HWMEDIA_PARAMETER_BANDWIDTH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "a371b149-5d9c-11df-9e91-0014222a9f79");
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
