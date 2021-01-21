/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_designmodel_hlam.standard.behavior;

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
 * Proxy class to handle a {@link Behavior} with << RtUnit_Behavior >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("c44fd5af-c51d-4d37-8488-6a9119fbdbc8")
public class RtUnitBehavior {
    @objid ("fe0a9306-57ea-41dd-95dd-c02db2098bca")
    public static final String STEREOTYPE_NAME = "RtUnit_Behavior";

    @objid ("ec76cbca-528d-4d81-b726-4d5cb06d9140")
    public static final String RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE = "RtUnit_Behavior_isDynamic";

    @objid ("b7568c42-3639-411d-b543-090f8d286910")
    public static final String RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE = "RtUnit_Behavior_isMain";

    @objid ("3c3278ed-0784-4ce2-8691-806992bd078e")
    public static final String RTUNIT_BEHAVIOR_MAIN_TAGTYPE = "RtUnit_Behavior_main";

    @objid ("a3765187-64b5-4d59-8705-016e8bdd13ea")
    public static final String RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE = "RtUnit_Behavior_memorySize";

    @objid ("b17f0f05-052e-4318-ba74-0c6bd05fb8e9")
    public static final String RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE = "RtUnit_Behavior_msgMaxSize";

    @objid ("3f8352f3-6701-4b67-a64c-22e43594986c")
    public static final String RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE = "RtUnit_Behavior_operationalMode";

    @objid ("946f439e-4660-434e-9aa2-29ceb85b6b48")
    public static final String RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE = "RtUnit_Behavior_queueSchedPolicy";

    @objid ("0c13bc67-11c9-4f21-8fe1-74395c56092d")
    public static final String RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE = "RtUnit_Behavior_queueSize";

    @objid ("b804280b-818c-4e2e-8fe7-d7a5f2759882")
    public static final String RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE = "RtUnit_Behavior_srPoolPolicy";

    @objid ("52e4867c-a843-4e39-9243-8c7a23ea5eed")
    public static final String RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE = "RtUnit_Behavior_srPoolSize";

    @objid ("3ef9285d-d99b-41a5-a871-fbe2e6bf1982")
    public static final String RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE = "RtUnit_Behavior_srPoolWaitingTime";

    /**
     * The underlying {@link Behavior} represented by this proxy, never null.
     */
    @objid ("b2158062-e64f-40bf-8529-3437f5fcab24")
    protected final Behavior elt;

    /**
     * Tells whether a {@link RtUnitBehavior proxy} can be instantiated from a {@link MObject} checking it is a {@link Behavior} stereotyped << RtUnit_Behavior >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("c2531c72-99be-4e87-8326-4d392054111d")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Behavior) && ((Behavior) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitBehavior.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Behavior} stereotyped << RtUnit_Behavior >> then instantiate a {@link RtUnitBehavior} proxy.
     * 
     * @return a {@link RtUnitBehavior} proxy on the created {@link Behavior}.
     */
    @objid ("5be55f86-cbe9-471c-9725-ae36939aa6b6")
    public static RtUnitBehavior create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Behavior");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, RtUnitBehavior.STEREOTYPE_NAME);
        return RtUnitBehavior.instantiate((Behavior)e);
    }

    /**
     * Tries to instantiate a {@link RtUnitBehavior} proxy from a {@link Behavior} stereotyped << RtUnit_Behavior >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Behavior
     * @return a {@link RtUnitBehavior} proxy or <i>null</i>.
     */
    @objid ("44141fde-e2ca-4d81-adff-fd5f620024bd")
    public static RtUnitBehavior instantiate(final Behavior obj) {
        return RtUnitBehavior.canInstantiate(obj) ? new RtUnitBehavior(obj) : null;
    }

    /**
     * Tries to instantiate a {@link RtUnitBehavior} proxy from a {@link Behavior} stereotyped << RtUnit_Behavior >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Behavior}
     * @return a {@link RtUnitBehavior} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("b828a3f2-25b7-4061-ba4b-41537bcdca40")
    public static RtUnitBehavior safeInstantiate(final Behavior obj) throws IllegalArgumentException {
        if (RtUnitBehavior.canInstantiate(obj))
        	return new RtUnitBehavior(obj);
        else
        	throw new IllegalArgumentException("RtUnitBehavior: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("d28d103e-4c7e-41ad-a956-5e9cb580b4c8")
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
        RtUnitBehavior other = (RtUnitBehavior) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Behavior}. 
     * @return the Behavior represented by this proxy, never null.
     */
    @objid ("6727c6a2-3808-4f6b-bc4a-63823d88f74d")
    public Behavior getElement() {
        return this.elt;
    }

    /**
     * Getter for string property 'RtUnit_Behavior_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8b007cc0-97c7-47d7-9a30-d29523607fc6")
    public String getRtUnit_Behavior_main() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MAIN_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("69de51a3-1f64-4286-9b2a-d187e15078a1")
    public String getRtUnit_Behavior_memorySize() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("00c18197-d092-45c4-866d-065724fa5095")
    public String getRtUnit_Behavior_msgMaxSize() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f00eeefe-e926-4d34-a8c7-6d8704b062af")
    public String getRtUnit_Behavior_operationalMode() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("64a3f7f5-794d-4425-b47f-7bb4b3f17da2")
    public String getRtUnit_Behavior_queueSchedPolicy() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("66570f41-daa2-45cc-9d48-d6c02b9086c8")
    public String getRtUnit_Behavior_queueSize() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("97e7b901-ae04-48ef-8a47-e1d7cd3d5412")
    public String getRtUnit_Behavior_srPoolPolicy() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9a8609e6-1b26-41c5-8d22-de7e89a8a033")
    public String getRtUnit_Behavior_srPoolSize() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'RtUnit_Behavior_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("557b3415-d1bd-40a9-ae95-68d28ffcfa01")
    public String getRtUnit_Behavior_srPoolWaitingTime() {
        return this.elt.getTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE_ELT);
    }

    @objid ("78d003f4-9b33-4b95-8a02-700b0fbc339e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'RtUnit_Behavior_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("0ea1a3c6-39e0-411a-a0fc-6f6a19c926bc")
    public boolean isRtUnit_Behavior_isDynamic() {
        return this.elt.isTagged(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Getter for boolean property 'RtUnit_Behavior_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("35980a5e-1e1f-41b0-9f37-d5fdd860a324")
    public boolean isRtUnit_Behavior_isMain() {
        return this.elt.isTagged(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Behavior_isDynamic'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("a3ca1a31-575d-429b-b22f-1ded6ca8f4db")
    public void setRtUnit_Behavior_isDynamic(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT);
    }

    /**
     * Setter for boolean property 'RtUnit_Behavior_isMain'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("6789a6b5-45fa-46e7-b7b0-e5227f3a6e6d")
    public void setRtUnit_Behavior_isMain(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_main'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("d918e369-838e-4ff4-b91b-73dd7899ae29")
    public void setRtUnit_Behavior_main(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MAIN_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_memorySize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("aba751e2-1eda-4bf1-a4d5-635196d8fed2")
    public void setRtUnit_Behavior_memorySize(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_msgMaxSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("f5442203-0d3a-4a0a-9e1d-f1ffa0363546")
    public void setRtUnit_Behavior_msgMaxSize(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_operationalMode'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2e685243-9674-4317-9a07-93558d903b37")
    public void setRtUnit_Behavior_operationalMode(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_queueSchedPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("abddee04-6784-4e01-86c5-7e8dca6f4548")
    public void setRtUnit_Behavior_queueSchedPolicy(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_queueSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("1172cfe7-da97-468d-9a6a-9d9a47738147")
    public void setRtUnit_Behavior_queueSize(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_srPoolPolicy'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("8c47d525-b67e-4ff5-9ed3-0a2b15611ac8")
    public void setRtUnit_Behavior_srPoolPolicy(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_srPoolSize'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("60769f4c-4f52-44fc-92c7-fb6515d15ce9")
    public void setRtUnit_Behavior_srPoolSize(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'RtUnit_Behavior_srPoolWaitingTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("556699e1-dbf2-40bf-9120-c71d2f1046c6")
    public void setRtUnit_Behavior_srPoolWaitingTime(final String value) {
        this.elt.putTagValue(RtUnitBehavior.MdaTypes.RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE_ELT, value);
    }

    @objid ("5f9a7eb2-90d8-448a-9952-a66dd3e1bda7")
    protected RtUnitBehavior(final Behavior elt) {
        this.elt = elt;
    }

    @objid ("d22baf59-0243-418c-8328-e8fe73a8bb80")
    public static final class MdaTypes {
        @objid ("6a5af404-139a-4a9b-887b-0d610f399597")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("3b4e34e8-2180-499d-a3bb-ecf4dc224024")
        public static TagType RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT;

        @objid ("af94fdda-dc19-4000-a8bf-b92ee3c85f8c")
        public static TagType RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT;

        @objid ("0508fa46-773d-4164-9c33-b2ac5b5a1109")
        public static TagType RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE_ELT;

        @objid ("5ff598aa-89de-4785-8961-81480f4ee5fa")
        public static TagType RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE_ELT;

        @objid ("35ce1ce1-3729-4d09-b292-f43978f9e55a")
        public static TagType RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE_ELT;

        @objid ("3a1e0e0b-1b48-40fd-8a3c-d0c680c95d4d")
        public static TagType RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE_ELT;

        @objid ("3960cd15-5580-45d2-a67b-eeb949786030")
        public static TagType RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE_ELT;

        @objid ("bd651ab7-a2cb-49e7-b63c-f42dce4e96cb")
        public static TagType RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE_ELT;

        @objid ("447a512c-d15c-4e1d-a645-aa1c2d8b5663")
        public static TagType RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE_ELT;

        @objid ("5c6e8dee-f5f6-4436-85c5-6b721b00469b")
        public static TagType RTUNIT_BEHAVIOR_MAIN_TAGTYPE_ELT;

        @objid ("e23f3181-3230-4877-bca3-21053626b15d")
        public static TagType RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT;

        @objid ("68987045-bb80-47b4-91ea-fa69ad96b258")
        private static Stereotype MDAASSOCDEP;

        @objid ("cb684511-1611-40b1-bf02-1790532982cd")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("a2e3d20a-fbcc-4077-94f9-8ed0613445d8")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "97dd8e9f-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_ISDYNAMIC_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c2b-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_ISMAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c2c-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_SRPOOLSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c2d-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_SRPOOLPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c32-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_SRPOOLWAITINGTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c33-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_QUEUESCHEDPOLICY_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a2e471d-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_BEHAVIOR_QUEUESIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a2e471b-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_BEHAVIOR_MSGMAXSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "9a2e471c-91c5-11e0-8b7d-0027103f347c");
            RTUNIT_BEHAVIOR_OPERATIONALMODE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c34-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_MAIN_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c35-0cea-11df-b742-001302895b2b");
            RTUNIT_BEHAVIOR_MEMORYSIZE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "97db2c2e-0cea-11df-b742-001302895b2b");
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
