/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.behavior;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
 * Proxy class to handle a {@link Behavior} with << TimedProcessing_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c4b66b23-d5b2-45bc-8fd3-2be6f5dbdff7")
public class TimedProcessingBehavior {
    @objid ("789dc1ed-a9a5-464f-866a-c7af4ad59bea")
    public static final String STEREOTYPE_NAME = "TimedProcessing_Behavior";

    @objid ("6b9087b3-58a1-4fa1-9788-e6d27288509c")
    public static final String TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE = "TimedProcessing_Behavior_duration";

    @objid ("75156c22-6b12-4ef8-9c57-e830fbce45b9")
    public static final String TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE = "TimedProcessing_Behavior_finish";

    @objid ("055f58de-1341-48ac-98fd-684c1a1a4748")
    public static final String TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE = "TimedProcessing_Behavior_on";

    @objid ("33f5a9e8-235c-4b1f-af2b-b7ed800fd042")
    public static final String TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE = "TimedProcessing_Behavior_start";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("98f7ee37-36c1-4cdb-a805-2402ea3d6bd2")
    protected final Behavior elt;

    /**
     * Tells whether a {@link TimedProcessingBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << TimedProcessing_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("0d18b731-d67a-433f-96b0-6b4d02a03352")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << TimedProcessing_Behavior >> then instantiate a {@link TimedProcessingBehavior} proxy.
     * 
     * @return a {@link TimedProcessingBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("b619fe2e-f883-4923-b8bc-7cf6c9c47dbb")
    public static TimedProcessingBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, TimedProcessingBehavior.STEREOTYPE_NAME);
        return TimedProcessingBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link TimedProcessingBehavior} proxy from a {@link Behavior} stereotyped << TimedProcessing_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link TimedProcessingBehavior} proxy or <i>null</i>.
     */
    @objid ("94eef5ed-8659-440a-b167-7b242658c674")
    public static TimedProcessingBehavior instantiate(final Behavior obj) {
        return TimedProcessingBehavior.canInstantiate(obj) ? new TimedProcessingBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link TimedProcessingBehavior} proxy from a {@link Behavior} stereotyped << TimedProcessing_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link TimedProcessingBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("df865e41-17f7-451c-a6ef-9812fe0233a2")
    public static TimedProcessingBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (TimedProcessingBehavior.canInstantiate(obj))
        	return new TimedProcessingBehavior(obj);
        else
        	throw new IllegalArgumentException("TimedProcessingBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("6a8064ed-c63e-4170-a1cd-94ab4ba700f4")
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
        TimedProcessingBehavior other = (TimedProcessingBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("294d2590-fc91-4220-b535-b3ac911d6a69")
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'TimedProcessing_Behavior_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66980c09-4eea-420c-bf24-d8c0228da53f")
    public String getTimedProcessing_Behavior_duration() {
        return this.elt.getTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_Behavior_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3f5af87-8f45-4c25-afe9-c79f10ae53eb")
    public String getTimedProcessing_Behavior_finish() {
        return this.elt.getTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE_ELT);
    }

    /**
     * Getter for List<String> property 'TimedProcessing_Behavior_on'
     * <p>Property description:<br/>
     * <i></i></p>
     */
    @objid ("cee580a7-2ca2-456d-ae19-62662884c9f1")
    public List<String> getTimedProcessing_Behavior_on() {
        return this.elt.getTagValues(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'TimedProcessing_Behavior_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("207ceef3-730c-47f2-a5ea-a196e6e74cd5")
    public String getTimedProcessing_Behavior_start() {
        return this.elt.getTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE_ELT);
    }

    @objid ("8b19226a-6b39-4913-a6d5-ed3af5b032b0")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Setter for string property 'TimedProcessing_Behavior_duration'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6ebd3b7a-142c-408e-ba12-8958f2233c99")
    public void setTimedProcessing_Behavior_duration(final String value) {
        this.elt.putTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'TimedProcessing_Behavior_finish'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("b1caffef-4544-4906-b247-090d753a0d92")
    public void setTimedProcessing_Behavior_finish(final String value) {
        this.elt.putTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE_ELT, value);
    }

    /**
     * Setter for List<String> property 'TimedProcessing_Behavior_on'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aadc166a-2fb5-4914-9510-e89114bc43bf")
    public void setTimedProcessing_Behavior_on(final List<String> values) {
        this.elt.putTagValues(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE_ELT, values);
    }

    /**
     * Setter for string property 'TimedProcessing_Behavior_start'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9dfe898d-9101-4db3-90de-3a1a46a4fe53")
    public void setTimedProcessing_Behavior_start(final String value) {
        this.elt.putTagValue(TimedProcessingBehavior.MdaTypes.TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE_ELT, value);
    }

    @objid ("56781f9c-6fba-4c2c-9e14-ed36e44f251a")
    protected TimedProcessingBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("4dfebacd-b8c6-4c1e-aa84-3112bad54a39")
    public static final class MdaTypes {
        @objid ("9b54b23a-5879-4ae8-9fa9-87d9cddfa51b")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("8fe9143a-5c48-4daa-9088-a4cfb353520b")
        public static TagType TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE_ELT;

        @objid ("da5985cd-74da-4300-a8a6-d8fa36f556e0")
        public static TagType TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE_ELT;

        @objid ("fb129969-b509-45bb-9b6b-691e0f4a9e89")
        public static TagType TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE_ELT;

        @objid ("b9cc9bbc-bfb0-4ee4-82be-0240b08110f2")
        public static TagType TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE_ELT;

        @objid ("d135a5e8-24db-4f1b-814a-69b0e9bd81ff")
        private static Stereotype MDAASSOCDEP;

        @objid ("79ad4a8c-5fd6-4a9a-9f14-e684058545f6")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("b381f74e-d062-408c-91be-1d4fc0c73a54")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "b507b8f9-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_BEHAVIOR_DURATION_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b507b8fa-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_BEHAVIOR_START_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b507b8fb-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_BEHAVIOR_FINISH_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "b507b8fc-1259-11df-8f55-0014222a9f79");
            TIMEDPROCESSING_BEHAVIOR_ON_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "bc77dba4-c7fd-11e0-9823-0027103f347c");
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
