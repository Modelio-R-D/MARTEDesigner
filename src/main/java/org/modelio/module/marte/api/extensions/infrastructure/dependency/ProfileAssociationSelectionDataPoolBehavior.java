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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_selection_DataPool_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("73cdab94-b9a7-41f4-a14b-45e0533bc5fa")
public class ProfileAssociationSelectionDataPoolBehavior {
    @objid ("8df926fc-7ae1-4b2f-9f9c-b05f8c9c80f3")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_selection_DataPool_Behavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("aa3486b8-3a3e-4016-b8de-81b228f659ee")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationSelectionDataPoolBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_selection_DataPool_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("39c15480-e18e-4e48-8b32-47748b8183de")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSelectionDataPoolBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_selection_DataPool_Behavior >> then instantiate a {@link ProfileAssociationSelectionDataPoolBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationSelectionDataPoolBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("34d1a593-f366-458d-ae0e-1bf1a3f9ca54")
    public static ProfileAssociationSelectionDataPoolBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationSelectionDataPoolBehavior.STEREOTYPE_NAME);
        return ProfileAssociationSelectionDataPoolBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSelectionDataPoolBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_selection_DataPool_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationSelectionDataPoolBehavior} proxy or <i>null</i>.
     */
    @objid ("b2388b68-5580-43ee-8e2f-a535688d1d54")
    public static ProfileAssociationSelectionDataPoolBehavior instantiate(final Dependency obj) {
        return ProfileAssociationSelectionDataPoolBehavior.canInstantiate(obj) ? new ProfileAssociationSelectionDataPoolBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationSelectionDataPoolBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_selection_DataPool_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationSelectionDataPoolBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("c9512a9e-0267-4aaf-91a4-91dbf262b15e")
    public static ProfileAssociationSelectionDataPoolBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationSelectionDataPoolBehavior.canInstantiate(obj))
        	return new ProfileAssociationSelectionDataPoolBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationSelectionDataPoolBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("3d31e446-61af-4821-96d3-55871dcb6bde")
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
        ProfileAssociationSelectionDataPoolBehavior other = (ProfileAssociationSelectionDataPoolBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("bf85e8e1-73d4-4151-afdf-47314063cdcd")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("bd52729c-571d-402e-abf7-3effd80b573e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("400e5db5-a8fe-458b-80cc-267d65e1e773")
    protected ProfileAssociationSelectionDataPoolBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("bb7c917d-d584-4daa-8820-4c14af485380")
    public static final class MdaTypes {
        @objid ("d44ea34e-3de8-4508-a4c0-82f0923319a1")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("c9b9eeb0-fa65-42e0-8b7a-88ca3710b600")
        private static Stereotype MDAASSOCDEP;

        @objid ("7ecbd975-42c3-414a-9d74-92c41eb317e6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("e303d0df-d1bf-4de5-9d72-cfd9498c872a")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "24db6ecc-98d0-11e0-aed9-0027103f347c");
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
