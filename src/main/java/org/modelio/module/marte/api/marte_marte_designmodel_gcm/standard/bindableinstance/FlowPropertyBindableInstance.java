/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.bindableinstance;

import java.util.ArrayList;
import java.util.Collections;
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
import org.modelio.metamodel.uml.statik.BindableInstance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link BindableInstance} with << FlowProperty_BindableInstance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class FlowPropertyBindableInstance {
    public static final String STEREOTYPE_NAME = "FlowProperty_BindableInstance";

    public static final String FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE = "FlowProperty_BindableInstance_direction";

    /**
     * The underlying {@link BindableInstance} represented by this proxy, never null.
     */
    protected final BindableInstance elt;

    /**
     * Tells whether a {@link FlowPropertyBindableInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link BindableInstance} stereotyped << FlowProperty_BindableInstance >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof BindableInstance) && ((BindableInstance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyBindableInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link BindableInstance} stereotyped << FlowProperty_BindableInstance >> then instantiate a {@link FlowPropertyBindableInstance} proxy.
     * 
     * @return a {@link FlowPropertyBindableInstance} proxy on the created {@link BindableInstance}.
     */
    public static FlowPropertyBindableInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.BindableInstance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, FlowPropertyBindableInstance.STEREOTYPE_NAME);
        return FlowPropertyBindableInstance.instantiate((BindableInstance)e);
    }

    /**
     * Tries to instantiate a {@link FlowPropertyBindableInstance} proxy from a {@link BindableInstance} stereotyped << FlowProperty_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a BindableInstance
     * @return a {@link FlowPropertyBindableInstance} proxy or <i>null</i>.
     */
    public static FlowPropertyBindableInstance instantiate(final BindableInstance obj) {
        return FlowPropertyBindableInstance.canInstantiate(obj) ? new FlowPropertyBindableInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FlowPropertyBindableInstance} proxy from a {@link BindableInstance} stereotyped << FlowProperty_BindableInstance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link BindableInstance}
     * @return a {@link FlowPropertyBindableInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static FlowPropertyBindableInstance safeInstantiate(final BindableInstance obj) throws IllegalArgumentException {
        if (FlowPropertyBindableInstance.canInstantiate(obj))
        	return new FlowPropertyBindableInstance(obj);
        else
        	throw new IllegalArgumentException("FlowPropertyBindableInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        FlowPropertyBindableInstance other = (FlowPropertyBindableInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link BindableInstance}. 
     * @return the BindableInstance represented by this proxy, never null.
     */
    public BindableInstance getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'FlowProperty_BindableInstance_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getFlowProperty_BindableInstance_direction() {
        return this.elt.getTagValue(FlowPropertyBindableInstance.MdaTypes.FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE_ELT);
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'FlowProperty_BindableInstance_direction'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setFlowProperty_BindableInstance_direction(final String value) {
        this.elt.putTagValue(FlowPropertyBindableInstance.MdaTypes.FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE_ELT, value);
    }

    protected FlowPropertyBindableInstance(final BindableInstance elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0247a677-0ccf-11df-8525-001302895b2b");
            FLOWPROPERTY_BINDABLEINSTANCE_DIRECTION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "0247a67a-0ccf-11df-8525-001302895b2b");
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
