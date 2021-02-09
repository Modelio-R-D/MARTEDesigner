/*
 * WARNING: GENERATED FILE - DO NOT EDIT
 * Module: MARTEDesigner v4.1.02

 * This file was generated on 2/4/21 4:12 PM by Modelio Studio.
 */
package org.modelio.module.marte.api.marte_marte_foundations_time.standard.class_;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
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
import org.modelio.metamodel.uml.statik.Class;
import org.modelio.module.marte.api.IMARTEDesignerPeerModule;
import org.modelio.module.marte.api.MARTEDesignerProxyFactory;
import org.modelio.module.marte.impl.MARTEModule;
import org.modelio.vcore.smkernel.mapi.MObject;

/**
 * Proxy class to handle a {@link Class} with << ClockType_Class >> stereotype.
 * <p>Stereotype description:
 * <br/><i></i></p>
 */
public class ClockTypeClass {
    public static final String STEREOTYPE_NAME = "ClockType_Class";

    public static final String CLOCKTYPE_CLASS_GETTIME_TAGTYPE = "ClockType_Class_getTime";

    public static final String CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE = "ClockType_Class_indexToValue";

    public static final String CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE = "ClockType_Class_isLogical";

    public static final String CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE = "ClockType_Class_maxValAttr";

    public static final String CLOCKTYPE_CLASS_NATURE_TAGTYPE = "ClockType_Class_nature";

    public static final String CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE = "ClockType_Class_offsetAttr";

    public static final String CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE = "ClockType_Class_resolAttr";

    public static final String CLOCKTYPE_CLASS_SETTIME_TAGTYPE = "ClockType_Class_setTime";

    public static final String CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE = "ClockType_Class_unitType";

    /**
     * The underlying {@link Class} represented by this proxy, never null.
     */
    protected final Class elt;

    /**
     * Tells whether a {@link ClockTypeClass proxy} can be instantiated from a {@link MObject} checking it is a {@link Class} stereotyped << ClockType_Class >>.
     * <p>
     * The method returns <code>false</code> if the instantiation cannot be carried out.
     * 
     * @param elt a model object
     * @return <code>true</code> if the instantiation can be carried out else <code>false</code>.
     */
    public static boolean canInstantiate(final MObject elt) {
        return ((elt instanceof Class) && ((Class) elt).isStereotyped(IMARTEDesignerPeerModule.MODULE_NAME, ClockTypeClass.STEREOTYPE_NAME));
    }

    /**
     * Create a new {@link Class} stereotyped << ClockType_Class >> then instantiate a {@link ClockTypeClass} proxy.
     * 
     * @return a {@link ClockTypeClass} proxy on the created {@link Class}.
     */
    public static ClockTypeClass create() {
        ModelElement e = (ModelElement)MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createElement("Standard.Class");
        e.addStereotype(IMARTEDesignerPeerModule.MODULE_NAME, ClockTypeClass.STEREOTYPE_NAME);
        return ClockTypeClass.instantiate((Class)e);
    }

    /**
     * Tries to instantiate a {@link ClockTypeClass} proxy from a {@link Class} stereotyped << ClockType_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method returns <i>null</i> if the instantiation cannot be carried out.
     * @param obj a Class
     * @return a {@link ClockTypeClass} proxy or <i>null</i>.
     */
    public static ClockTypeClass instantiate(final Class obj) {
        return ClockTypeClass.canInstantiate(obj) ? new ClockTypeClass(obj) : null;
    }

    /**
     * Tries to instantiate a {@link ClockTypeClass} proxy from a {@link Class} stereotyped << ClockType_Class >> checking its metaclass and its stereotype. 
     * <p>
     * The method throws an {@link IllegalArgumentException} if the instantiation cannot be carried out.
     * @param obj a {@link Class}
     * @return a {@link ClockTypeClass} proxy.
     * @throws IllegalArgumentException if the instantiation cannot be carried out.
     */
    public static ClockTypeClass safeInstantiate(final Class obj) throws IllegalArgumentException {
        if (ClockTypeClass.canInstantiate(obj))
        	return new ClockTypeClass(obj);
        else
        	throw new IllegalArgumentException("ClockTypeClass: Cannot instantiate "+obj+": wrong element type or stereotype");
    }

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
        ClockTypeClass other = (ClockTypeClass) obj;
        return java.util.Objects.equals(getElement(), other.getElement());
    }

    /**
     * Getter for string property 'ClockType_Class_getTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClockType_Class_getTime() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_GETTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_indexToValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClockType_Class_indexToValue() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_maxValAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClockType_Class_maxValAttr() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClockType_Class_nature() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_NATURE_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_offsetAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClockType_Class_offsetAttr() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_resolAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClockType_Class_resolAttr() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_setTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClockType_Class_setTime() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_SETTIME_TAGTYPE_ELT);
    }

    /**
     * Getter for string property 'ClockType_Class_unitType'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public String getClockType_Class_unitType() {
        return this.elt.getTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE_ELT);
    }

    /**
     * Get the underlying {@link Class}. 
     * @return the Class represented by this proxy, never null.
     */
    public Class getElement() {
        return this.elt;
    }

    @Override
    public int hashCode() {
        return 23 + ((this.elt == null) ? 0 : this.elt.hashCode());
    }

    /**
     * Getter for boolean property 'ClockType_Class_isLogical'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public boolean isClockType_Class_isLogical() {
        return this.elt.isTagged(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'ClockType_Class_getTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClockType_Class_getTime(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_GETTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_indexToValue'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClockType_Class_indexToValue(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for boolean property 'ClockType_Class_isLogical'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClockType_Class_isLogical(final boolean value) {
        if (value)
          MARTEModule.getInstance().getModuleContext().getModelingSession().getModel().createTaggedValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT, this.elt);
        else
          this.elt.removeTags(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT);
    }

    /**
     * Setter for string property 'ClockType_Class_maxValAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClockType_Class_maxValAttr(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_nature'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClockType_Class_nature(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_NATURE_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_offsetAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClockType_Class_offsetAttr(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_resolAttr'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClockType_Class_resolAttr(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_setTime'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClockType_Class_setTime(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_SETTIME_TAGTYPE_ELT, value);
    }

    /**
     * Setter for string property 'ClockType_Class_unitType'
     * <p>Property description:
     * <br/><i></i></p>
     */
    public void setClockType_Class_unitType(final String value) {
        this.elt.putTagValue(ClockTypeClass.MdaTypes.CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE_ELT, value);
    }

    protected ClockTypeClass(final Class elt) {
        this.elt = elt;
    }

    public static final class MdaTypes {
        public static Stereotype STEREOTYPE_ELT;

        public static TagType CLOCKTYPE_CLASS_NATURE_TAGTYPE_ELT;

        public static TagType CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE_ELT;

        public static TagType CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT;

        public static TagType CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE_ELT;

        public static TagType CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE_ELT;

        public static TagType CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE_ELT;

        public static TagType CLOCKTYPE_CLASS_GETTIME_TAGTYPE_ELT;

        public static TagType CLOCKTYPE_CLASS_SETTIME_TAGTYPE_ELT;

        public static TagType CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE_ELT;

        private static Stereotype MDAASSOCDEP;

        private static TagType MDAASSOCDEP_ROLE;

        public static void init(final IModuleContext ctx) {
            STEREOTYPE_ELT = ctx.getModelingSession().findElementById(Stereotype.class, "dae571f0-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_NATURE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571f6-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_UNITTYPE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae571fc-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_ISLOGICAL_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae57202-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_RESOLATTR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d42f-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_MAXVALATTR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d435-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_OFFSETATTR_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d43b-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_GETTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d441-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_SETTIME_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d447-0cce-11df-8525-001302895b2b");
            CLOCKTYPE_CLASS_INDEXTOVALUE_TAGTYPE_ELT = ctx.getModelingSession().findElementById(TagType.class, "dae7d44d-0cce-11df-8525-001302895b2b");
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
