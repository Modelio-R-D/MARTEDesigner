/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwdevice.standard.parameter;

import java.util.ArrayList;
import java.util.Collections;
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
 * Proxy class to handle a {@link Parameter} with << HwI_O_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("f5985ac7-61b8-43cf-bbce-6bf2df930324")
public class HwIOParameter extends HwDeviceParameter {
    @objid ("a8735014-0dca-439c-b4b1-1bb32bf581d3")
    public static final String STEREOTYPE_NAME = "HwI_O_Parameter";

    /**
     * Tells whether a {@link HwIOParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwI_O_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("399cb866-4ec3-4160-8756-12d1a8b45d89")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwIOParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwI_O_Parameter >> then instantiate a {@link HwIOParameter} proxy.
     * 
     * @return a {@link HwIOParameter} proxy on the created {@link Parameter}.
     */
    @objid ("87f905b5-9a1c-40fd-872a-e6ecbe5ece05")
    public static HwIOParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwIOParameter.STEREOTYPE_NAME);
        return HwIOParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwIOParameter} proxy from a {@link Parameter} stereotyped << HwI_O_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwIOParameter} proxy or <i>null</i>.
     */
    @objid ("d8bf6799-cbbc-4c13-a5b7-9384acc19feb")
    public static HwIOParameter instantiate(final Parameter obj) {
        return HwIOParameter.canInstantiate(obj) ? new HwIOParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwIOParameter} proxy from a {@link Parameter} stereotyped << HwI_O_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwIOParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7e32195b-28c8-4f43-ae43-404937e6436a")
    public static HwIOParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwIOParameter.canInstantiate(obj))
        	return new HwIOParameter(obj);
        else
        	throw new IllegalArgumentException("HwIOParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("4571d708-a312-42d3-ab3a-393dd9e1bbfe")
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
        HwIOParameter other = (HwIOParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("ea26eb1b-06fc-4bf4-a585-2b565dd0fe34")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("a07190ce-3e50-4031-bd0e-e02940412d9d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("9460fb7b-a3e0-465a-9ad9-289f0e7c1207")
    protected HwIOParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("39bce26b-205a-4e31-9988-40271f6fbd2e")
    public static final class MdaTypes {
        @objid ("ee6b2f8a-f408-490f-8f85-9e45b2780e13")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8c479375-5f69-44fa-80ff-3a8020549366")
        private static Stereotype MDAASSOCDEP;

        @objid ("ad5d22af-9d1a-448d-bad8-d67be5b77a44")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("586ce366-93ba-4da9-93e5-1b66ac98ee4e")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0137ddf2-0ccf-11df-8525-001302895b2b");
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
