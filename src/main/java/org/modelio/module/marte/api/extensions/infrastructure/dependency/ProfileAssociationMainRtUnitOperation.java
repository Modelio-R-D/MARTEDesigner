/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.extensions.infrastructure.dependency;

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
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_main_RtUnit_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("fb9a931d-46d8-4b33-8732-2e80e10aff76")
public class ProfileAssociationMainRtUnitOperation {
    @objid ("0318171f-aebe-4778-b72a-c598a3e6703b")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_main_RtUnit_Operation";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("359eb83a-9e1e-455f-aa35-003fb83baa84")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationMainRtUnitOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_main_RtUnit_Operation >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("fa53867f-d004-485b-838b-9678390afbe8")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMainRtUnitOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_main_RtUnit_Operation >> then instantiate a {@link ProfileAssociationMainRtUnitOperation} proxy.
     * 
     * @return a {@link ProfileAssociationMainRtUnitOperation} proxy on the created {@link Dependency}.
     */
    @objid ("ea051745-be0d-4f7a-af36-5687415e9244")
    public static ProfileAssociationMainRtUnitOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationMainRtUnitOperation.STEREOTYPE_NAME);
        return ProfileAssociationMainRtUnitOperation.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMainRtUnitOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_main_RtUnit_Operation >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationMainRtUnitOperation} proxy or <i>null</i>.
     */
    @objid ("9066f8ca-1a61-4020-b99a-4848533aaa14")
    public static ProfileAssociationMainRtUnitOperation instantiate(final Dependency obj) {
        return ProfileAssociationMainRtUnitOperation.canInstantiate(obj) ? new ProfileAssociationMainRtUnitOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationMainRtUnitOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_main_RtUnit_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationMainRtUnitOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("9c6ce6c8-fdac-4200-b23d-fcf02bc57448")
    public static ProfileAssociationMainRtUnitOperation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationMainRtUnitOperation.canInstantiate(obj))
        	return new ProfileAssociationMainRtUnitOperation(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationMainRtUnitOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("670500f5-33b2-47dd-a193-e8d1e225d490")
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
        ProfileAssociationMainRtUnitOperation other = (ProfileAssociationMainRtUnitOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("c0f50a3d-6fcf-49dc-bf97-f77d05bfc7a5")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("ad1924fc-4700-4dd0-ad18-f243703feb5d")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("20988c6a-d72c-4326-b5a4-a8191d71afd3")
    protected ProfileAssociationMainRtUnitOperation(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("3e50982b-bba8-4a34-a9c7-cd7c688dbadb")
    public static final class MdaTypes {
        @objid ("c0689027-3a64-42c0-a3d2-f95430079633")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("f8c36c68-59ad-4920-8c6b-74e08d435c64")
        private static Stereotype MDAASSOCDEP;

        @objid ("de5cf6d6-3245-4a61-945d-71fb2bda573b")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("d22976af-d7e3-4e56-9c29-58fd778f0853")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "02ad3d26-91db-11e0-a465-0027103f347c");
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
