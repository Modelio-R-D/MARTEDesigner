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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_insertion_DataPool_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("1fb3d8c3-ac2d-4ffe-84ce-5dd1c7a9814f")
public class ProfileAssociationInsertionDataPoolBehavior {
    @objid ("7bc2d374-1b29-4795-a297-3416c0963a3e")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_insertion_DataPool_Behavior";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("5037b675-9196-42e1-8098-ec7e2845019a")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationInsertionDataPoolBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_insertion_DataPool_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6bbca87b-c6e2-409a-bacf-682eb7858fdd")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInsertionDataPoolBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_insertion_DataPool_Behavior >> then instantiate a {@link ProfileAssociationInsertionDataPoolBehavior} proxy.
     * 
     * @return a {@link ProfileAssociationInsertionDataPoolBehavior} proxy on the created {@link Dependency}.
     */
    @objid ("b2888276-457a-4abc-a76c-e8c7d4f38c5e")
    public static ProfileAssociationInsertionDataPoolBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationInsertionDataPoolBehavior.STEREOTYPE_NAME);
        return ProfileAssociationInsertionDataPoolBehavior.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInsertionDataPoolBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_insertion_DataPool_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationInsertionDataPoolBehavior} proxy or <i>null</i>.
     */
    @objid ("dd506f0d-d889-44a9-9ac2-07b30fa30ef9")
    public static ProfileAssociationInsertionDataPoolBehavior instantiate(final Dependency obj) {
        return ProfileAssociationInsertionDataPoolBehavior.canInstantiate(obj) ? new ProfileAssociationInsertionDataPoolBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationInsertionDataPoolBehavior} proxy from a {@link Dependency} stereotyped << ProfileAssociation_insertion_DataPool_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationInsertionDataPoolBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b91cd3ae-bfab-4e56-9b87-e72c070fb406")
    public static ProfileAssociationInsertionDataPoolBehavior safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationInsertionDataPoolBehavior.canInstantiate(obj))
        	return new ProfileAssociationInsertionDataPoolBehavior(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationInsertionDataPoolBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("f06856da-2f8c-431a-9dff-280667d5993a")
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
        ProfileAssociationInsertionDataPoolBehavior other = (ProfileAssociationInsertionDataPoolBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("8d194d33-3783-464a-be95-6bfc7db40b38")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("3ca1dcb5-3556-4ac7-adca-7e3cc29a12ab")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("3ae11349-08b6-40d9-bea1-cea36f6ffa11")
    protected ProfileAssociationInsertionDataPoolBehavior(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("b72c4ba3-fd60-4957-9911-150b6631207f")
    public static final class MdaTypes {
        @objid ("4ba92613-1861-491f-9c14-fd6f51963e40")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5b82f7dd-dc9a-44e5-851c-0225169669bc")
        private static Stereotype MDAASSOCDEP;

        @objid ("f4a55699-0cfb-4dc9-88da-28a8eee3b25a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ccb4efba-59d8-4c05-84cc-4468ef0c3d76")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "36516284-98d0-11e0-aed9-0027103f347c");
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
