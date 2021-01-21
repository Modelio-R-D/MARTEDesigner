/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.commonBehaviors.Behavior;
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
 * Proxy class to handle a {@link Behavior} with << Release_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("002a799f-92a2-4746-ab91-6c8445b2502d")
public class ReleaseBehavior extends GrServiceBehavior {
    @objid ("7bc767c6-275b-4bc4-b5bd-1a5a41e0d949")
    public static final String STEREOTYPE_NAME = "Release_Behavior";

    /**
     * Tells whether a {@link ReleaseBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << Release_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("59e3b9c7-c35d-48dd-8694-d41afdb585d9")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << Release_Behavior >> then instantiate a {@link ReleaseBehavior} proxy.
     * 
     * @return a {@link ReleaseBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("1eb1bc96-b4b5-47de-8d91-9e05630f72c5")
    public static ReleaseBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ReleaseBehavior.STEREOTYPE_NAME);
        return ReleaseBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link ReleaseBehavior} proxy from a {@link Behavior} stereotyped << Release_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link ReleaseBehavior} proxy or <i>null</i>.
     */
    @objid ("83c4a494-4045-4298-ac84-d401289ce211")
    public static ReleaseBehavior instantiate(final Behavior obj) {
        return ReleaseBehavior.canInstantiate(obj) ? new ReleaseBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ReleaseBehavior} proxy from a {@link Behavior} stereotyped << Release_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link ReleaseBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("bfd8f07a-1d07-421d-bdad-94982b1319cb")
    public static ReleaseBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (ReleaseBehavior.canInstantiate(obj))
        	return new ReleaseBehavior(obj);
        else
        	throw new IllegalArgumentException("ReleaseBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("bf0aaf6b-9d79-4d16-91da-2e2a37f40ddf")
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
        ReleaseBehavior other = (ReleaseBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("51ca2417-e11f-44aa-be7e-32b9388822b4")
    @Override
    public Behavior getElement() {
        return (Behavior)super.getElement();
    }

    @objid ("157eb02b-af70-450e-b86a-3da3a74101a9")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("c58fcbe6-aac9-4c04-b5d9-c42f5989acc3")
    protected ReleaseBehavior(final Behavior elt) {
        super(elt);
    }

    @objid ("0e37b514-5161-41cd-8cf6-c1217a6c1834")
    public static final class MdaTypes {
        @objid ("d6d4dd91-4175-4735-a084-7bae3970dea6")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("471bd795-6da2-4ea7-af6c-3906e9e9ef31")
        private static Stereotype MDAASSOCDEP;

        @objid ("01764598-44d2-4d06-acc2-590226417662")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("93248373-42b2-454f-a4c6-ca91afd2e451")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "00ab350e-0ccf-11df-8525-001302895b2b");
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
