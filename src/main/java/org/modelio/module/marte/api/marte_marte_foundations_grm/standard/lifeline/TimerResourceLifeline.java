/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_grm.standard.lifeline;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import com.modeliosoft.modelio.javadesigner.annotations.objid;
import org.modelio.api.modelio.model.IModelingSession;
import org.modelio.api.modelio.model.PropertyConverter;
import org.modelio.api.module.context.IModuleContext;
import org.modelio.metamodel.mmextensions.infrastructure.ExtensionNotFoundException;
import org.modelio.metamodel.uml.behavior.interactionModel.Lifeline;
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
 * Proxy class to handle a {@link Lifeline} with << TimerResource_Lifeline >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("ca53a307-b633-4947-847a-3e4e5cd223d4")
public class TimerResourceLifeline extends TimingResourceLifeline {
    @objid ("57e09625-ddb6-4259-bb0c-f5b57db4a001")
    public static final String STEREOTYPE_NAME = "TimerResource_Lifeline";

    @objid ("17a0828f-083b-40a0-b447-f091dea40aa0")
    public static final String TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE = "TimerResource_Lifeline_duration";

    @objid ("50e46f82-171f-4bc7-b609-b0bc25e48a60")
    public static final String TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE = "TimerResource_Lifeline_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << TimerResource_Lifeline >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("a9877033-1ec0-4421-a798-a082cd48a199")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << TimerResource_Lifeline >> then instantiate a {@link TimerResourceLifeline} proxy.
     * 
     * @return a {@link TimerResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("9b08a6ba-5ec4-4740-a7ed-464bb6979c06")
    public static TimerResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLifeline.STEREOTYPE_NAME);
        return TimerResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceLifeline} proxy from a {@link Lifeline} stereotyped << TimerResource_Lifeline >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link TimerResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("164ab94d-07ef-4757-959b-d68424d2fb39")
    public static TimerResourceLifeline instantiate(final Lifeline obj) {
        return TimerResourceLifeline.canInstantiate(obj) ? new TimerResourceLifeline(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimerResourceLifeline} proxy from a {@link Lifeline} stereotyped << TimerResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Lifeline}
     * @return a {@link TimerResourceLifeline} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("cd0b6975-9692-449e-859d-2d686ac6ecb8")
    public static TimerResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (TimerResourceLifeline.canInstantiate(obj))
        	return new TimerResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("TimerResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("a3df782b-feb0-4c9b-ac53-99854aef044f")
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
        TimerResourceLifeline other = (TimerResourceLifeline) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Lifeline}. 
     * @return the Lifeline represented by this proxy, never null.
     */
    @objid ("cfa815d7-33a2-40eb-87e9-31d5ff07b3b4")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Lifeline_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("870a0b2c-3c5b-4625-8bb0-dd2e1bf19b13")
    public String getTimerResource_Lifeline_duration() {
        return this.elt.getTagValue(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT);
    }

    @objid ("e7dcff82-a5d2-413a-a9be-6751f8748279")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Lifeline_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("187dbf15-2507-4976-beeb-80a5d075776e")
    public boolean isTimerResource_Lifeline_isPeriodic() {
        return this.elt.isTagged(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Lifeline_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6d476a9f-6210-47e3-a766-81a56ea732cd")
    public void setTimerResource_Lifeline_duration(final String value) {
        this.elt.putTagValue(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Lifeline_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("4290baf1-6648-4bba-9cfe-27b01279b3fb")
    public void setTimerResource_Lifeline_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("71889057-fcc6-42b5-9449-51fdb59c29b3")
    protected TimerResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("79a6997f-cba1-4047-99f0-d762a38d5dfb")
    public static final class MdaTypes {
        @objid ("0c10687c-6126-46cd-8b35-40e94a329468")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9eed1eef-ea39-4ea2-87d8-dc8170d0d8c5")
        public static TagType TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT;

        @objid ("84678985-d75a-44dd-a214-342674fb6286")
        public static TagType TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT;

        @objid ("c48a1c78-87d5-4d65-b474-a02028a79deb")
        private static Stereotype MDAASSOCDEP;

        @objid ("22139256-1290-4ba2-ad5f-847127318652")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("55de2dea-6c9f-49a4-99b2-5797cf1c30af")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "54f186c5-0f4c-11df-8c52-0014222a9f79");
            TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "81888b54-14c6-11df-92f7-001302895b2b");
            TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "87643c4a-14c6-11df-92f7-001302895b2b");
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
