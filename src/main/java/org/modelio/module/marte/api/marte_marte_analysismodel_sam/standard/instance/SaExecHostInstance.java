/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.0.01

 * This file was generated on 3/11/20 12:01 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_analysismodel_sam.standard.instance;

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
import org.modelio.metamodel.uml.statik.Instance;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.api.marte_marte_analysismodel_gqam.standard.instance.GaExecHostInstance;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Instance} with << SaExecHost_Instance >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
@objid ("9e1b4b23-2229-4f0c-b6d8-d0daa420d0f3")
public class SaExecHostInstance extends GaExecHostInstance {
    @objid ("080d8152-5fd4-4371-b827-f089d53e3d47")
    public static final String STEREOTYPE_NAME = "SaExecHost_Instance";

    @objid ("2259b381-c8f2-4dbc-bd7f-f198ed0bc86e")
    public static final String SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE = "SaExecHost_Instance_ISRprioRange";

    @objid ("93de115d-5ff4-4cd8-adc5-f55d79b00ae7")
    public static final String SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE = "SaExecHost_Instance_ISRswitchT";

    @objid ("c87e97b5-69d2-46ca-906f-066dd424227c")
    public static final String SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE = "SaExecHost_Instance_isSched";

    @objid ("5286b58a-6d25-44b8-aa2b-47cec403ab05")
    public static final String SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE = "SaExecHost_Instance_schSlack";

    @objid ("ebf956ea-daab-43e3-be5f-c72104bb6356")
    public static final String SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE = "SaExecHost_Instance_schedUtiliz";

    /**
     * Tells whether a {@link SaExecHostInstance proxy} can be instantiated from a {@link MObject} checking it is a {@link Instance} stereotyped << SaExecHost_Instance >>. 
     * <p>
     * The method returns <i>false</i> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <i>true</i> if the instantiation can be carried out else <i>false</i>.
     */
    @objid ("6e92fc8d-e501-436d-a62c-e523e3e019ef")
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Instance) && ((Instance) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostInstance.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Instance} stereotyped << SaExecHost_Instance >> then instantiate a {@link SaExecHostInstance} proxy.
     * 
     * @return a {@link SaExecHostInstance} proxy on the created {@link Instance}.
     */
    @objid ("2dd5a594-1d04-4702-a49a-916223ec5afa")
    public static SaExecHostInstance create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Instance");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, SaExecHostInstance.STEREOTYPE_NAME);
        return SaExecHostInstance.instantiate((Instance)e);
    }

    /**
     * Tries to instantiate a {@link SaExecHostInstance} proxy from a {@link Instance} stereotyped << SaExecHost_Instance >>checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Instance
     * @return a {@link SaExecHostInstance} proxy or <i>null</i>.
     */
    @objid ("2da2beb5-e4cd-49bd-96ba-4489a6517131")
    public static SaExecHostInstance instantiate(final Instance obj) {
        return SaExecHostInstance.canInstantiate(obj) ? new SaExecHostInstance(obj) : null;
    }

    /**
     * Tries to instantiate a {@link SaExecHostInstance} proxy from a {@link Instance} stereotyped << SaExecHost_Instance >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Instance}
     * @return a {@link SaExecHostInstance} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    @objid ("7ec8a229-e269-4d86-bdf0-a4a69627d9d8")
    public static SaExecHostInstance safeInstantiate(final Instance obj) throws IllegalArgumentException {
        if (SaExecHostInstance.canInstantiate(obj))
        	return new SaExecHostInstance(obj);
        else
        	throw new IllegalArgumentException("SaExecHostInstance: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

    @objid ("fdce7de3-fcb2-4488-a3e3-a900b17d2aa8")
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
        SaExecHostInstance other = (SaExecHostInstance) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Get the underlying {@link Instance}. 
     * @return the Instance represented by this proxy, never null.
     */
    @objid ("80bc9547-d90b-4816-b5dc-d19d49791b0f")
    @Override
    public Instance getElement() {
        return (Instance)super.getElement();
    }

    /**
     * Getter for string property 'SaExecHost_Instance_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("793c105e-2ea9-4872-a743-2280aa87328b")
    public String getSaExecHost_Instance_ISRprioRange() {
        return this.elt.getTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Instance_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("7c79fc67-8bff-4b8a-8e18-209538046e8c")
    public String getSaExecHost_Instance_ISRswitchT() {
        return this.elt.getTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Instance_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c46eed04-b67c-4db2-b8ac-115470f5bc38")
    public String getSaExecHost_Instance_schSlack() {
        return this.elt.getTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'SaExecHost_Instance_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("c34cdf64-937c-4781-865b-b73dd6417f98")
    public String getSaExecHost_Instance_schedUtiliz() {
        return this.elt.getTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE_ELT);
    }

    @objid ("2c79c389-8ac2-4387-bf03-7b970c3fe97e")
    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'SaExecHost_Instance_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("5f02783a-8d9f-4796-813f-7ff40ce23010")
    public boolean isSaExecHost_Instance_isSched() {
        return this.elt.isTagged(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Instance_ISRprioRange'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("9e4523f0-b779-4782-8942-a9acfaa5e583")
    public void setSaExecHost_Instance_ISRprioRange(final String value) {
        this.elt.putTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Instance_ISRswitchT'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("bdfc9c2a-a939-40ea-9a7d-faf239ada56b")
    public void setSaExecHost_Instance_ISRswitchT(final String value) {
        this.elt.putTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'SaExecHost_Instance_isSched'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2811a355-feff-4d90-af8c-a95858cdbee5")
    public void setSaExecHost_Instance_isSched(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'SaExecHost_Instance_schSlack'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("3597b24d-746c-47cd-83a5-e90841fa3621")
    public void setSaExecHost_Instance_schSlack(final String value) {
        this.elt.putTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'SaExecHost_Instance_schedUtiliz'
     * <p>Property description:
     * <br/><i></i></p>
     */
    @objid ("2a41867e-7504-44e2-9993-3bfeb5750edd")
    public void setSaExecHost_Instance_schedUtiliz(final String value) {
        this.elt.putTagValue(SaExecHostInstance.MdaTypes.SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE_ELT, value);
    }

    @objid ("d370176e-42f6-4bf9-bdf9-6bc21c3eb3cd")
    protected SaExecHostInstance(final Instance elt) {
        super(elt);
    }

    @objid ("47608e91-69b9-45a5-a7f1-6e0b2f4752ab")
    public static final class MdaTypes {
        @objid ("e0631bf2-9e96-481a-a907-b6f77ab98ef3")
        public static Stereotype STEREOTYPE_ELT;

        @objid ("0af344de-4e2b-429d-ae17-b0879ecc04f4")
        public static TagType SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT;

        @objid ("f1b7f020-8c6c-4cca-bc42-a17adef77345")
        public static TagType SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT;

        @objid ("c6f2552e-3a14-4d00-b9da-9cd4bb3cd08a")
        public static TagType SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE_ELT;

        @objid ("b824ad5e-2e08-45a8-a132-744f10d79299")
        public static TagType SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE_ELT;

        @objid ("6d17b2b3-c599-479a-91a4-988edaa565ff")
        public static TagType SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE_ELT;

        @objid ("17ab68ea-9870-4ede-ba87-a9a0ae249ccd")
        private static Stereotype MDAASSOCDEP;

        @objid ("4928a7bf-519c-4812-9092-2f53de9a2053")
        private static TagType MDAASSOCDEP_ROLE;

        @objid ("ab9d067f-21cd-459a-bcf6-46e3a581ac95")
        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "03a156ee-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_ISSCHED_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b940-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_SCHSLACK_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b947-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_SCHEDUTILIZ_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b94e-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_ISRSWITCHT_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b955-0ccf-11df-8525-001302895b2b");
            SAEXECHOST_INSTANCE_ISRPRIORANGE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "03a3b95c-0ccf-11df-8525-001302895b2b");
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
