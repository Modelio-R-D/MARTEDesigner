/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
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
    @objid ("70a2cc11-013b-4a25-8249-a0b0746ab66c")
    public static final String STEREOTYPE_NAME = "TimerResource_Lifeline";

    @objid ("5a6bea95-c7f7-4c95-ab7e-275c0d52c2d7")
    public static final String TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE = "TimerResource_Lifeline_duration";

    @objid ("6a8171ef-75ce-422f-b888-cb02ac9035b0")
    public static final String TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE = "TimerResource_Lifeline_isPeriodic";

    /**
     * Tells whether a {@link TimerResourceLifeline proxy} can be instantiated from a {@link MObject} checking it is a {@link Lifeline} stereotyped << TimerResource_Lifeline >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    @objid ("368db077-89a6-4427-a526-b6c46902b0d6")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Lifeline) && ((Lifeline) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLifeline.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Lifeline} stereotyped << TimerResource_Lifeline >> then instantiate a {@link TimerResourceLifeline} proxy.
     * 
     * @return a {@link TimerResourceLifeline} proxy on the created {@link Lifeline}.
     */
    @objid ("83bfae94-afc8-470f-b2a2-c4cced5e4e3d")
    public static TimerResourceLifeline create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Lifeline");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimerResourceLifeline.STEREOTYPE_NAME);
        return TimerResourceLifeline.instantiate((Lifeline)e);
    }

    /**
     * Tries to instantiate a {@link TimerResourceLifeline} proxy from a {@link Lifeline} stereotyped << TimerResource_Lifeline >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Lifeline
     * @return a {@link TimerResourceLifeline} proxy or <i>null</i>.
     */
    @objid ("778a92e1-3d5e-4272-bc20-1b5120ee10d6")
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
    @objid ("632f1cae-072e-4dc2-b7e1-a78297751385")
    public static TimerResourceLifeline safeInstantiate(final Lifeline obj) throws IllegalArgumentException {
        if (TimerResourceLifeline.canInstantiate(obj))
        	return new TimerResourceLifeline(obj);
        else
        	throw new IllegalArgumentException("TimerResourceLifeline: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("643bd1e4-7880-4182-acf4-487ae159c436")
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
    @objid ("d9fb6cef-02b8-4eb7-bef6-b72ef65c6f32")
    @Override
    public Lifeline getElement() {
        return (Lifeline)super.getElement();
    }

    /**
     * Getter for string property 'TimerResource_Lifeline_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("63af8c00-b8c2-4936-a63a-de94cba8d344")
    public String getTimerResource_Lifeline_duration() {
        return this.elt.getTagValue(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT);
    }

    @objid ("c1d23b1f-f42c-4212-b195-4988d1b6c444")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'TimerResource_Lifeline_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("552ef086-a951-4601-84f5-bb455ed931be")
    public boolean isTimerResource_Lifeline_isPeriodic() {
        return this.elt.isTagged(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'TimerResource_Lifeline_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5b3e1a23-848d-4bbf-9c0a-0d6bd497815a")
    public void setTimerResource_Lifeline_duration(final String value) {
        this.elt.putTagValue(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'TimerResource_Lifeline_isPeriodic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f894688c-703a-4934-83b1-18e314077aeb")
    public void setTimerResource_Lifeline_isPeriodic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(TimerResourceLifeline.MdaTypes.TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT);
    }

    @objid ("f26d0c3c-3194-4c3b-acad-6d9de8bcda3f")
    protected TimerResourceLifeline(final Lifeline elt) {
        super(elt);
    }

    @objid ("79a6997f-cba1-4047-99f0-d762a38d5dfb")
    public static final class MdaTypes {
        @objid ("fd331e4b-3828-4b9a-87f5-f261e82181f9")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("9ba637e0-3642-4e38-a848-5fbd43227b57")
        public static TagType TIMERRESOURCE_LIFELINE_DURATION_TAGTYPE_ELT;

        @objid ("fb3037b7-28c3-435e-8866-4f5aaf5263af")
        public static TagType TIMERRESOURCE_LIFELINE_ISPERIODIC_TAGTYPE_ELT;

        @objid ("bffa749e-4f97-4010-928a-865ee493d4a3")
        private static Stereotype MDAASSOCDEP;

        @objid ("061f7ae2-7b2c-41e9-bad7-11c92c24503a")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b5268dab-d50b-482a-a81e-83011492765f")
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
