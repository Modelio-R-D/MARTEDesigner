/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.interface_;

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
import org.modelio.metamodel.uml.statik.Interface;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Interface} with << FlowSpecification_Interface >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class FlowSpecificationInterface {
    public static final String STEREOTYPE_NAME = "FlowSpecification_Interface";

    /**
     * The underlying {@link Interface} represented by this proxy, never null.
     */
    protected final Interface elt;

    /**
     * Tells whether a {@link FlowSpecificationInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link Interface} stereotyped << FlowSpecification_Interface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Interface) && ((Interface) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowSpecificationInterface.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Interface} stereotyped << FlowSpecification_Interface >> then instantiate a {@link FlowSpecificationInterface} proxy.
     * 
     * @return a {@link FlowSpecificationInterface} proxy on the created {@link Interface}.
     */
    public static FlowSpecificationInterface create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Interface");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, FlowSpecificationInterface.STEREOTYPE_NAME);
        return FlowSpecificationInterface.instantiate((Interface)e);
    }

    /**
     * Tries to instantiate a {@link FlowSpecificationInterface} proxy from a {@link Interface} stereotyped << FlowSpecification_Interface >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Interface
     * @return a {@link FlowSpecificationInterface} proxy or <i>null</i>.
     */
    public static FlowSpecificationInterface instantiate(final Interface obj) {
        return FlowSpecificationInterface.canInstantiate(obj) ? new FlowSpecificationInterface(obj) : null;
    }

    /**
     * Tries to instantiate a {@link FlowSpecificationInterface} proxy from a {@link Interface} stereotyped << FlowSpecification_Interface >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Interface}
     * @return a {@link FlowSpecificationInterface} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static FlowSpecificationInterface safeInstantiate(final Interface obj) throws IllegalArgumentException {
        if (FlowSpecificationInterface.canInstantiate(obj))
        	return new FlowSpecificationInterface(obj);
        else
        	throw new IllegalArgumentException("FlowSpecificationInterface: Cannot instantiate "+obj+": wrong element type or stereotype");
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
        FlowSpecificationInterface other = (FlowSpecificationInterface) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Interface}. 
     * @return the Interface represented by this proxy, never null.
     */
    public Interface getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    protected FlowSpecificationInterface(final Interface elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "0255f475-0ccf-11df-8525-001302895b2b");
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
