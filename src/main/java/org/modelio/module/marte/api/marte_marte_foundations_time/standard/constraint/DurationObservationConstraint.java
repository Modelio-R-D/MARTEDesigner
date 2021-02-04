/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.constraint;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.infrastructure.Constraint;
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
 * Proxy class to handle a {@link Constraint} with << DurationObservation_Constraint >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("25755b2c-1d83-4713-8fc7-30e0294e6a3a")
public class DurationObservationConstraint {
    @objid ("ea2abb1e-0725-48a1-865c-5462d63d66ae")
    public static final String STEREOTYPE_NAME = "DurationObservation_Constraint";

    /**
     * The underlying {@link Constraint} represented by this proxy, never null.
     */
    @objid ("a50590ed-4547-4c7c-9460-d371b679019a")
    protected final Constraint elt;

    /**
     * Tells whether a {@link DurationObservationConstraint proxy} can be instantiated from a {@link MObject} checking it is a {@link Constraint} stereotyped << DurationObservation_Constraint >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("b3ba424d-153c-4ece-8855-60ba57526ebe")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Constraint) && ((Constraint) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, DurationObservationConstraint.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Constraint} stereotyped << DurationObservation_Constraint >> then instantiate a {@link DurationObservationConstraint} proxy.
     * 
     * @return a {@link DurationObservationConstraint} proxy on the created {@link Constraint}.
     */
    @objid ("0864f14e-aff9-413d-8aca-c5906356f98f")
    public static DurationObservationConstraint create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Constraint");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, DurationObservationConstraint.STEREOTYPE_NAME);
        return DurationObservationConstraint.instantiate((Constraint)e);
    }

    /**
     * Tries to instantiate a {@link DurationObservationConstraint} proxy from a {@link Constraint} stereotyped << DurationObservation_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Constraint
     * @return a {@link DurationObservationConstraint} proxy or <i>null</i>.
     */
    @objid ("506b2eca-52b9-4fc1-ab19-1d1cd3828e76")
    public static DurationObservationConstraint instantiate(final Constraint obj) {
        return DurationObservationConstraint.canInstantiate(obj) ? new DurationObservationConstraint(obj) : null;
    }

    /**
     * Tries to instantiate a {@link DurationObservationConstraint} proxy from a {@link Constraint} stereotyped << DurationObservation_Constraint >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Constraint}
     * @return a {@link DurationObservationConstraint} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("17a6bc03-5b79-4e9e-aa3f-5c0242ba62c9")
    public static DurationObservationConstraint safeInstantiate(final Constraint obj) throws IllegalArgumentException {
        if (DurationObservationConstraint.canInstantiate(obj))
        	return new DurationObservationConstraint(obj);
        else
        	throw new IllegalArgumentException("DurationObservationConstraint: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("013379a3-683a-4a0e-88bb-4dcf1160ed24")
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
        DurationObservationConstraint other = (DurationObservationConstraint) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Constraint}. 
     * @return the Constraint represented by this proxy, never null.
     */
    @objid ("82ff089f-8729-497d-ad49-047aefa2009b")
    public Constraint getElement() {
        return this.elt;
    }

    @objid ("789744b2-b542-4a3b-a225-40d022e26cd0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    @objid ("d3fd0e94-3b48-4224-8d0e-69182914e719")
    protected DurationObservationConstraint(final Constraint elt) {
        this.elt = elt;
    }

    @objid ("d4584cbe-a7aa-4b45-b0ee-27f45f6a21b2")
    public static final class MdaTypes {
        @objid ("7c0e5cfb-a0a1-41cf-8ca7-217a2a383c36")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("5564c6f6-9f7a-4761-a386-60ae82e10bc5")
        private static Stereotype MDAASSOCDEP;

        @objid ("15437e13-e6cc-4d39-9a59-c55725651716")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("66a30210-1d07-4faa-8762-761043e458c0")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "fb23468a-3ac9-11e1-960b-0027103f347d");
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
