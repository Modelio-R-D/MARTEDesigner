/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("756f699b-b4e6-42b4-97ac-40bede2d2381")
    public static final String STEREOTYPE_NAME = "FlowSpecification_Interface";

    /**
     * The underlying {@link Interface} represented by this proxy, never null.
     */
    @objid ("e5c78802-0e2d-432c-8eab-5da2640eed2d")
    protected final Interface elt;

    /**
     * Tells whether a {@link FlowSpecificationInterface proxy} can be instantiated from a {@link MObject} checking it is a {@link Interface} stereotyped << FlowSpecification_Interface >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("dc818665-fa7b-4e41-906f-fb4f6220cc54")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Interface) && ((Interface) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, FlowSpecificationInterface.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Interface} stereotyped << FlowSpecification_Interface >> then instantiate a {@link FlowSpecificationInterface} proxy.
     * 
     * @return a {@link FlowSpecificationInterface} proxy on the created {@link Interface}.
     */
    @objid ("5e462a13-82db-4e72-a4c2-480373fedc35")
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
    @objid ("03d22165-4442-459f-b7fe-45e39baf656b")
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
    @objid ("ee3eec34-99fd-450b-9d4e-25084e06df15")
    public static FlowSpecificationInterface safeInstantiate(final Interface obj) throws IllegalArgumentException {
        if (FlowSpecificationInterface.canInstantiate(obj))
        	return new FlowSpecificationInterface(obj);
        else
        	throw new IllegalArgumentException("FlowSpecificationInterface: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a6bf5ec-0be7-450d-88b4-15c99c7f2228")
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
    @objid ("73b1968a-e091-49db-9b54-7706ba34e6f8")
    public Interface getElement() {
        return this.elt;
    }

    @objid ("ba712326-8bbc-4b48-bc45-cd3e28dd5ced")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("183dbf0a-79a7-4f48-988e-9bbf063c8a57")
    protected FlowSpecificationInterface(final Interface elt) {
        this.elt = elt;
    }

    @objid ("4815af5c-5461-478f-a3aa-74cec96f3be9")
    public static final class MdaTypes {
        @objid ("8dc31898-e252-4fc3-a13b-b0412595e412")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("36b6d527-d0a2-425a-be50-aaab4c5de6b5")
        private static Stereotype MDAASSOCDEP;

        @objid ("eee76822-db8e-4047-b685-e0d93cfd2ceb")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("f3a2680a-e995-45ae-8971-006e4b6c6c36")
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
