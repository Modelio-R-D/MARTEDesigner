/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
 * Proxy class to handle a {@link Dependency} with << ProfileAssociation_getTime_ClockType_Operation >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ef02c721-5ca5-48d1-afad-450c5a78cded")
public class ProfileAssociationGetTimeClockTypeOperation {
    @objid ("3ed88413-ee04-4048-a386-a0c12cf3bfaa")
    public static final String STEREOTYPE_NAME = "ProfileAssociation_getTime_ClockType_Operation";

    /**
     * The underlying {@link Dependency} represented by this proxy, never null.
     */
    @objid ("1609e3bc-3eb8-4f4f-a031-c8952140bc47")
    protected final Dependency elt;

    /**
     * Tells whether a {@link ProfileAssociationGetTimeClockTypeOperation proxy} can be instantiated from a {@link MObject} checking it is a {@link Dependency} stereotyped << ProfileAssociation_getTime_ClockType_Operation >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("58c85365-4adb-4171-8034-e513a12b2875")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Dependency) && ((Dependency) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationGetTimeClockTypeOperation.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Dependency} stereotyped << ProfileAssociation_getTime_ClockType_Operation >> then instantiate a {@link ProfileAssociationGetTimeClockTypeOperation} proxy.
     * 
     * @return a {@link ProfileAssociationGetTimeClockTypeOperation} proxy on the created {@link Dependency}.
     */
    @objid ("d69bdb76-e46b-401c-a92f-453c382cc10d")
    public static ProfileAssociationGetTimeClockTypeOperation create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Infrastructure.Dependency");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ProfileAssociationGetTimeClockTypeOperation.STEREOTYPE_NAME);
        return ProfileAssociationGetTimeClockTypeOperation.instantiate((Dependency)e);
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationGetTimeClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_getTime_ClockType_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Dependency
     * @return a {@link ProfileAssociationGetTimeClockTypeOperation} proxy or <i>null</i>.
     */
    @objid ("b037e992-8699-4ee2-beeb-d5f148b5901a")
    public static ProfileAssociationGetTimeClockTypeOperation instantiate(final Dependency obj) {
        return ProfileAssociationGetTimeClockTypeOperation.canInstantiate(obj) ? new ProfileAssociationGetTimeClockTypeOperation(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ProfileAssociationGetTimeClockTypeOperation} proxy from a {@link Dependency} stereotyped << ProfileAssociation_getTime_ClockType_Operation >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Dependency}
     * @return a {@link ProfileAssociationGetTimeClockTypeOperation} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("35d4d1cc-4140-448a-9357-977d93427cb3")
    public static ProfileAssociationGetTimeClockTypeOperation safeInstantiate(final Dependency obj) throws IllegalArgumentException {
        if (ProfileAssociationGetTimeClockTypeOperation.canInstantiate(obj))
        	return new ProfileAssociationGetTimeClockTypeOperation(obj);
        else
        	throw new IllegalArgumentException("ProfileAssociationGetTimeClockTypeOperation: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("dd7f3244-292e-412b-b51e-f7396f2a8f38")
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
        ProfileAssociationGetTimeClockTypeOperation other = (ProfileAssociationGetTimeClockTypeOperation) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Dependency}. 
     * @return the Dependency represented by this proxy, never null.
     */
    @objid ("f86bd8ff-1454-4fe7-b109-f2c0d44e6046")
    public Dependency getElement() {
        return this.elt;
    }

    @objid ("a73f4108-4ac9-4886-bdcd-eb235534381c")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("59f2916f-887d-4468-a4b8-57ffe3159a46")
    protected ProfileAssociationGetTimeClockTypeOperation(final Dependency elt) {
        this.elt = elt;
    }

    @objid ("1c977c94-5ee7-4ba3-9b30-0469f6515cbc")
    public static final class MdaTypes {
        @objid ("ab5e0fa2-21ba-4b1f-9bd5-d13bd78b5686")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("a9277ff1-33dc-426c-9f33-32ceda0ad86b")
        private static Stereotype MDAASSOCDEP;

        @objid ("09b005bf-efa6-4509-b457-3e66bc66e88e")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("cd81bc79-804b-462f-b63b-556f4dc18bae")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "cfae173d-82bb-11df-b65a-0014222a9f79");
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
