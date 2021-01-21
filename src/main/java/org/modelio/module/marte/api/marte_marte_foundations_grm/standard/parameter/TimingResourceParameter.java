/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.parameter;

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
 * Proxy class to handle a {@link Parameter} with << TimingResource_Parameter >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("e1af36f4-b796-4003-8753-2ce9180ff1ea")
public class TimingResourceParameter extends ResourceParameter {
    @objid ("58f85a26-5bea-4515-af31-13ba79fedfe0")
    public static final String STEREOTYPE_NAME = "TimingResource_Parameter";

    /**
     * Tells whether a {@link TimingResourceParameter proxy} can be instantiated from a {@link MObject} checking it is a {@link Parameter} stereotyped << TimingResource_Parameter >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9bed05d6-d5b4-48ca-8a4d-03584b53ed98")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Parameter) && ((Parameter) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceParameter.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Parameter} stereotyped << TimingResource_Parameter >> then instantiate a {@link TimingResourceParameter} proxy.
     * 
     * @return a {@link TimingResourceParameter} proxy on the created {@link Parameter}.
     */
    @objid ("a0ad5083-e58e-4264-b65c-e53e3f77f08d")
    public static TimingResourceParameter create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Parameter");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimingResourceParameter.STEREOTYPE_NAME);
        return TimingResourceParameter.instantiate((Parameter)e);
    }

    /**
     * Tries to instantiate a {@link TimingResourceParameter} proxy from a {@link Parameter} stereotyped << TimingResource_Parameter >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Parameter
     * @return a {@link TimingResourceParameter} proxy or <i>null</i>.
     */
    @objid ("fa104581-454f-4cc1-b2d5-cdffb8208555")
    public static TimingResourceParameter instantiate(final Parameter obj) {
        return TimingResourceParameter.canInstantiate(obj) ? new TimingResourceParameter(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimingResourceParameter} proxy from a {@link Parameter} stereotyped << TimingResource_Parameter >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Parameter}
     * @return a {@link TimingResourceParameter} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("dde67760-a833-456a-b868-ec163a892cb5")
    public static TimingResourceParameter safeInstantiate(final Parameter obj) throws IllegalArgumentException {
        if (TimingResourceParameter.canInstantiate(obj))
        	return new TimingResourceParameter(obj);
        else
        	throw new IllegalArgumentException("TimingResourceParameter: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("7b2061d5-cef6-4035-adbd-c7e55f97e18b")
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
        TimingResourceParameter other = (TimingResourceParameter) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Parameter}. 
     * @return the Parameter represented by this proxy, never null.
     */
    @objid ("0f25dff0-d987-471f-b683-5c6acb72011a")
    @Override
    public Parameter getElement() {
        return (Parameter)super.getElement();
    }

    @objid ("e8aa781c-03c1-4748-849d-8f4754eb7445")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d8302cc7-6380-428a-a604-166be01c30d0")
    protected TimingResourceParameter(final Parameter elt) {
        super(elt);
    }

    @objid ("4dbf546f-b2ce-48fd-8259-856ed59d97d6")
    public static final class MdaTypes {
        @objid ("342ff32d-b44b-4dfb-bd52-3a8a29607687")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("1553eef2-e553-4093-90f4-87d54e0f0693")
        private static Stereotype MDAASSOCDEP;

        @objid ("ab16f764-4a8c-4832-b19c-988c7c8c8cf4")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("4690b913-ab3a-41cd-81b2-17043685ef3a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "c9d02cc7-0f4b-11df-8c52-0014222a9f79");
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
