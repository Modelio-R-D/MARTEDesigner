/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwlogical_hwcommunication.standard.parameter;

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
import org.modelio.module.marte.api.marte_marte_designmodel_hrm_hwgeneral.standard.parameter.HwResourceParameter;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Parameter} with << HwCommunicationResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c9152405-bc8b-4983-b688-a56a63d3e50d")
public class HwCommunicationResourceParameter extends HwResourceParameter {
    @objid ("7f0174b8-35ac-44fd-9dc5-dc0ba98a3981")
    public static final String STEREOTYPE_NAME = "HwCommunicationResource_Parameter";

    /**
     * Tells whether a {@link HwCommunicationResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << HwCommunicationResource_Parameter >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("8ed46e80-c0c3-479d-81e3-ffaa137b4494")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << HwCommunicationResource_Parameter >> then instantiate a {@link HwCommunicationResourceParameter} proxy.
     * 
     * @return a {@link HwCommunicationResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("748a36d4-1388-4d83-b3c6-8ce8bb95e532")
    public static HwCommunicationResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, HwCommunicationResourceParameter.STEREOTYPE_NAME);
        return HwCommunicationResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceParameter} proxy from a {@link Parameter} stereotyped << HwCommunicationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link HwCommunicationResourceParameter} proxy or <i>null</i>.
     */
    @objid ("cecedfe7-91bb-4cbc-b31d-8bca2ea5eff0")
    public static HwCommunicationResourceParameter instantiate(final Parameter obj) {
        return HwCommunicationResourceParameter.canInstantiate(obj) ? new HwCommunicationResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link HwCommunicationResourceParameter} proxy from a {@link Parameter} stereotyped << HwCommunicationResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link HwCommunicationResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("2e847621-9fe0-479f-8975-374993395764")
    public static HwCommunicationResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (HwCommunicationResourceParameter.canInstantiate(obj))
        	return new HwCommunicationResourceParameter(obj);
        else
        	throw new IllegalArgumentException("HwCommunicationResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("ab450c0f-e37f-4fbe-b899-4af99771e8dc")
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
        HwCommunicationResourceParameter other = (HwCommunicationResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("850c9b02-5fd2-4974-a2ee-6a15721cb234")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("aaff6b1b-92e5-4463-bb4d-bb0d5c605e49")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("60ebbe16-262e-4edb-8f64-97fcde72f46f")
    protected HwCommunicationResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("0c567160-5c21-4b48-ab42-1c918eddee27")
    public static final class MdaTypes {
        @objid ("af6b5a0d-de07-40ec-9432-e874eff0c01d")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("12365577-15c8-4109-bf14-2e8d8ddb7f1d")
        private static Stereotype MDAASSOCDEP;

        @objid ("3fc4fc1e-04a2-4a86-a050-59b3c33a42a4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("88640802-c544-495f-ae17-18b0a86d695a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00fea642-0ccf-11df-8525-001302895b2b");
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
