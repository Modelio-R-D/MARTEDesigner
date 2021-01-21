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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_routine_EntryPoint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9610ed54-7caf-446f-848e-3b09048f2fb0")
public class ProfileAssociationRoutineEntryPoint {
    @objid ("ff75edf8-a7f3-45f4-8c04-bbbf3ece5d54")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_routine_EntryPoint";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("5c65b43b-68e9-41f5-8472-b67f5a53fafb")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationRoutineEntryPoint proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_routine_EntryPoint >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("9448babc-009e-4783-9a97-405e4ec57be6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRoutineEntryPoint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_routine_EntryPoint >> then instantiate a {@link ProfileAssociationRoutineEntryPoint} proxy.
     * 
     * @return a {@link ProfileAssociationRoutineEntryPoint} proxy on the created {@link Dependency}.
     */
    @objid ("6c159f75-1800-4d0b-b306-aab45a8e9951")
    public static ProfileAssociationRoutineEntryPoint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationRoutineEntryPoint.STEREOTYPE_NAME);
        return ProfileAssociationRoutineEntryPoint.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRoutineEntryPoint} proxy from a {@link Dependency} stereotyped << ProfileAssociation_routine_EntryPoint >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationRoutineEntryPoint} proxy or <i>null</i>.
     */
    @objid ("62a0701d-ce97-4ffe-8ca5-1b85e98b072c")
    public static ProfileAssociationRoutineEntryPoint instantiate(final Dependency obj) {
        return ProfileAssociationRoutineEntryPoint.canInstantiate(obj) ? new ProfileAssociationRoutineEntryPoint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationRoutineEntryPoint} proxy from a {@link Dependency} stereotyped << ProfileAssociation_routine_EntryPoint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationRoutineEntryPoint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7aae91fa-d379-4691-baba-b567c8c29d74")
    public static ProfileAssociationRoutineEntryPoint safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationRoutineEntryPoint.canInstantiate(obj))
        	return new ProfileAssociationRoutineEntryPoint(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationRoutineEntryPoint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("9a6cb535-a002-414f-a56c-ffc88c9fb16c")
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
        ProfileAssociationRoutineEntryPoint other = (ProfileAssociationRoutineEntryPoint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("13403d15-700c-4d24-913e-241117009b7d")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("2fd4d7c3-25c0-40e3-919a-c182a3380d02")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("967473cf-2911-4a07-ba70-98f83ebd07f1")
    protected ProfileAssociationRoutineEntryPoint(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("a6a27df6-c715-47e7-9aa6-f2c6679080d3")
    public static final class MdaTypes {
        @objid ("b3099edb-7da8-4f28-9fd4-97ea4ac4e8af")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("2f62edc6-75f8-435b-b12e-8bf6be7c3dec")
        private static Stereotype MDAASSOCDEP;

        @objid ("eb22734e-2d9a-4b80-b8a8-a1060dd9b844")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("bb343c1d-45bb-40ee-8e7f-b73055b7cb08")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "14c57773-9756-11e0-94fb-0027103f347c");
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
