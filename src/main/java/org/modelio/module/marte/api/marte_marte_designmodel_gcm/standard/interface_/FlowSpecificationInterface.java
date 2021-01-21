/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_gcm.standard.interface_;

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
@objid ("9abdea82-77ac-4cba-b247-014a3f06c46d")
public class FlowSpecificationInterface {
    @objid ("41bb57ab-2258-43c1-9b81-5de8bcd9c92d")
    public static final String STEREOTYPE_NAME = "FlowSpecification_Interface";

    /**
     * The underlying {@link Interface} represented by this proxy, never null.
     */
    @objid ("b68f08fb-1743-4257-a8eb-7db6cf000424")
    protected final Interface elt;

    /**
     * Tells whether a {@link FlowSpecificationInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link Interface} stereotyped << FlowSpecification_Interface >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("87c9d7af-5085-4785-9945-a6e7dd4decb1")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Interface) && ((Interface) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowSpecificationInterface.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Interface} stereotyped << FlowSpecification_Interface >> then instantiate a {@link FlowSpecificationInterface} proxy.
     * 
     * @return a {@link FlowSpecificationInterface} proxy on the created {@link Interface}.
     */
    @objid ("06b42c6f-be4a-47d3-8068-dfb2f639e276")
    public static FlowSpecificationInterface create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Interface");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, FlowSpecificationInterface.STEREOTYPE_NAME);
        return FlowSpecificationInterface.instantiate((Interface)e);
    }

    /**
     * Tries to instantiate a {@link FlowSpecificationInterface} proxy from a {@link Interface} stereotyped << FlowSpecification_Interface >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Interface
     * @return a {@link FlowSpecificationInterface} proxy or <i>null</i>.
     */
    @objid ("a0812085-d65c-4ca2-9e9d-f935d3ea23b3")
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
    @objid ("8ad4b706-56a8-4059-a5de-44b73142a974")
    public static FlowSpecificationInterface safeInstantiate(final Interface obj) throws IllegalArgumentException {
        if (FlowSpecificationInterface.canInstantiate(obj))
        	return new FlowSpecificationInterface(obj);
        else
        	throw new IllegalArgumentException("FlowSpecificationInterface: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("285e5b0d-a6e9-440f-8c1e-5923aaf2493a")
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
    @objid ("5b570e51-61fe-4a8d-be81-5c953451571b")
    public Interface getElement() {
        return this.elt;
    }

    @objid ("3d9dc8c9-626f-4e77-ae8c-e67d3da015b3")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("289f8997-6b8d-4cc6-b945-38a70337163d")
    protected FlowSpecificationInterface(final Interface elt) {
        this.elt = elt;
    }

    @objid ("4815af5c-5461-478f-a3aa-74cec96f3be9")
    public static final class MdaTypes {
        @objid ("c1b16879-432e-493d-975b-07ece1fc9fd4")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("775ae250-f051-4cb7-82d3-89adf34eaba2")
        private static Stereotype MDAASSOCDEP;

        @objid ("94057b28-2c1a-4889-97de-6b7d7f179d7c")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("04ada1b4-1e9e-45dd-9470-113b4499ec94")
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
